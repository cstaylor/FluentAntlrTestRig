package org.cstaylor.antlr4.utils.test;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.cstaylor.antlr4.utils.ProgrammaticTestRig;

public class ProgrammaticTestRigRunner
{
    public static void main ( String[] args ) throws Exception
    {
        URL url = ProgrammaticTestRigRunner.class.getResource( "t.properties" );
        Path path = Paths.get ( url.toURI() );
        ProgrammaticTestRig rig = new ProgrammaticTestRig().GUI()
                                                           .LEXER(PropertyFileLexer.class)
                                                           .PARSER(PropertyFileParser.class)
                                                           .START_RULE ( "file" )
                                                           .INPUT( path );
        rig.process();
    }

}
