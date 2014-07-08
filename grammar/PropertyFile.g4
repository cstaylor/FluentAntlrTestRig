grammar PropertyFile;

file: prop+;
prop: ID '=' STRING NEWLINE ;

STRING : '"' (' '..'~')* '"';
ID: [a-zA-Z]+ ;
NEWLINE: ('\r'|'\r\n')+;
