grammar language;

//Tokens
COMMENT
    : '(' .*? ')' -> skip;
IF: 'IF';
COMMA: ',';
NUM: '-'?[0-9]+;
LSQBRACKET: '[';
RSQBRACKET: ']';
SEMICOLON: ';';
VAR: 'VAR';
BEGIN: 'BEGIN';
END: 'END';
ASSIGN: 'ASSIGN';
ELSE: 'ELSE';
THEN: 'THEN';
ENDIF: 'ENDIF';
WHILE: 'WHILE';
REPEAT: 'REPEAT';
DO: 'DO';
ENDWHILE: 'ENDWHILE';
UNTIL: 'UNTIL';
FOR: 'FOR';
FROM: 'FROM';
DOWNTO: 'DOWNTO';
TO: 'TO';
ENDFOR: 'ENDFOR';
READ: 'READ';
WRITE: 'WRITE';
PLUS: 'PLUS';
MINUS: 'MINUS';
DIV: 'DIV';
TIMES: 'TIMES';
MOD: 'MOD';
EQ: 'EQ';
NEQ: 'NEQ';
LE: 'LE';
GE: 'GE';
LEQ: 'LEQ';
GEQ: 'GEQ';
WHITESPACE: ('\t' | ' ' | '\r' | '\n'| '\u000C')+ ;
PIDENTIFIER: [_a-z]+;
CHARACTER: [a-zA-Z]+;

//Rules
start
  : program;

program
  : possibleWhitespace VAR WHITESPACE declarations WHITESPACE BEGIN WHITESPACE commands possibleWhitespace END EOF? #Declare_Start
  | possibleWhitespace BEGIN WHITESPACE commands END possibleWhitespace EOF? #Nodeclare_Start;

declarations
 : possibleWhitespace PIDENTIFIER LSQBRACKET left=NUM ':' right=NUM RSQBRACKET COMMA WHITESPACE declarations #Put_Table1
 | possibleWhitespace PIDENTIFIER COMMA WHITESPACE declarations  #Put_Symbol1
 | possibleWhitespace PIDENTIFIER LSQBRACKET left=NUM ':' right=NUM RSQBRACKET #Put_Table2
 | possibleWhitespace PIDENTIFIER #Put_Symbol2;

commands
 : commands command WHITESPACE #GetCommands
 | command WHITESPACE #GetCommand;

command
 : possibleWhitespace identifier WHITESPACE ASSIGN WHITESPACE expression SEMICOLON #Assign_Statement
 | possibleWhitespace IF WHITESPACE condition WHITESPACE THEN WHITESPACE commands possibleWhitespace ENDIF #If_Statement
 | possibleWhitespace IF WHITESPACE condition WHITESPACE THEN WHITESPACE ifblock=commands ELSE WHITESPACE elseblock=commands ENDIF  #IfElse_Statement
 | possibleWhitespace WHILE WHITESPACE condition WHITESPACE DO WHITESPACE commands ENDWHILE #While_Statement
 | possibleWhitespace REPEAT WHITESPACE commands UNTIL WHITESPACE condition SEMICOLON #Repeat_Statement
 | possibleWhitespace FOR WHITESPACE PIDENTIFIER WHITESPACE FROM WHITESPACE v1=value WHITESPACE direction=(TO|DOWNTO) WHITESPACE v2=value WHITESPACE DO WHITESPACE commands ENDFOR #For_Statement
 | possibleWhitespace READ WHITESPACE identifier SEMICOLON #Read_Statement
 | possibleWhitespace WRITE WHITESPACE value SEMICOLON #Write_Statement;


expression
 : possibleWhitespace value #Eval_Value
 | possibleWhitespace left=value WHITESPACE operator=(PLUS|MINUS|TIMES|DIV|MOD) WHITESPACE right=value #Calculate_Value;

condition
 : possibleWhitespace left=value WHITESPACE oparator=(EQ|NEQ|LE|GE|LEQ|GEQ) WHITESPACE right=value #Calculate_Bool;

value
 : possibleWhitespace NUM #Get_Number
 | possibleWhitespace identifier #Get_Identifier;

identifier
 : possibleWhitespace PIDENTIFIER #Get_PIDENTIFIER
 | possibleWhitespace PIDENTIFIER LSQBRACKET PIDENTIFIER RSQBRACKET #Get_ArrayMemberByPID
 | possibleWhitespace PIDENTIFIER LSQBRACKET NUM RSQBRACKET #Get_ArrayMemberByVal;

possibleWhitespace
 : WHITESPACE
 | ;
