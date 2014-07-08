FluentAntlrTestRig
==================

I'm teaching myself ANTLR4 for some DSL work I'm doing, and I wanted a bit more control over the TestRig than what is
available by default through the command-line.

So, I put together this simple project, and I hope it's useful for others wanting to focus on ANTLR without getting bogged
down with file locations and other goblins.

The key class is the org.cstaylor.antlr4.utils.ProgrammaticTestRig, while the main entry point is org.cstaylor.antlr4.utils.test.ProgrammaticTestRigRunner.

You'll need Java 7+ and ANT if you want to run this from the command line: ant run.
