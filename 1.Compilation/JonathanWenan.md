Java Compilation Process
Please write a short description about what you have learnt about from java compilation process.

When we want to run a file, there are 2 main steps on performing your code in the Java Virtual Machine(JVM). Those 2 main steps are compiling and executing. 

First, we write the source code that can be accepted as a Java language in an IDE. After they finish making the source code, they will save it in the form of a Java file(.java) . When we want to run the file, the java file will be converted with a compiler. The compiler’s function is to convert the java file into a bytecode file (.class), which is typed or displayed in a different language than the original file. This is because the Java language in the original file is converted to a different language that we couldn’t understand. The compiler will check for errors such as invalid syntax or missing parameters in a function. If there are no errors,  they will be sent to the compiler to be converted to a bytecode file. 

After the file is converted into bytecode, the execution process will begin. First, the bytecode file will be transferred to the JVM. Inside the JVM, they will search for the bytecode file through a “class loader”. Next, the bytecode verifier will check for any bugs or errors in the bytecodes of the compiled file. After that, the source code will be converted to another language that can be understood by the machine through an interpreter. The interpreter will read the code and convert the code line by line. Finally, they will be transferred to the computer and they will be able to execute the commands, because they were converted to a language that can be comprehended by the computer. 


Reference:
https://www.youtube.com/watch?v=GXUiEouK7DM
https://www.javatpoint.com/internal-details-of-hello-java-program
