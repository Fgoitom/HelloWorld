//package cs201labs.lab11;
//import java.util.Scanner;
//public class Ques2 {

//              Scanner scanner = new Scanner(System.in);
//                    try{
//                    int num = scanner.nextInt();
//                    if ( num!=0){
//                    throw new java.lang.Exception("Not zero");
//                    }
//                    System.out.println("I'm happy with the input.");
//
//                    } catch (InputMismatchException e){
//                    System.out.println("Invalid Entry");
//                    }catch (Exception e){
//                    System.out.println(" Error: " + e.getMessage());
//                    } finally {
//                        System.out.println("Finally Clause Executed")
//
//
//                    }
//                    }
//                    a). -1;
//           Output : Error:Not zero
//                    Finally Clause Executed
//                    b). 0;
//           Output : I'm happy with the input.
//                    Finally Clause Executed
//                    c). 12xy;
//           Output : Invalid entry
//                    Finally Clause Executed
//}
