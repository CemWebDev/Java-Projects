import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String progress;
            // menu section syntax.
            System.out.println("If you want to use the calculator input 'enter' value");
            System.out.println("If you want shut down the calculator system input 'exit' value");
            System.out.println(">>");
            progress = scanner.next();
            if (progress.equals("enter")) {
                int operationId;
                System.out.println("If you want to use yhe calculator for 4 basic operations, enter 1");
                System.out
                        .println("If you want to use calculator for trigonometrical and hyperbolic functions, enter 2");
                System.out.println("If you want to use calculator for operations on integers, enter 3");
                System.out
                        .println("If you want to use calculator for exponential and logarithmical functions, enter 4");
                System.out.println(">>");
                operationId = scanner.nextInt();
                // 4 basic operations block starts here.
                if (operationId == 1) {
                    int firstSectionId;
                    System.out.println("Enter 1 for addition");
                    System.out.println("Enter 2 for subtraction");
                    System.out.println("Enter 3 for multiplication");
                    System.out.println("Enter 4 for division");
                    System.out.println(">>");
                    firstSectionId = scanner.nextInt();
                    if (firstSectionId < 1 || firstSectionId > 4) {
                        System.out.println("PLease enter a valid value");
                    } else if (firstSectionId == 1) {
                        double number1, number2, total;
                        System.out.println("Enter the first Number");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the second Number");
                        number2 = scanner.nextDouble();
                        total = number1 + number2;
                        System.out.println(number1 + "+" + number2 + " = " + total);
                    } else if (firstSectionId == 2) {
                        double number1, number2, total;
                        System.out.println("Enter the first Number");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the second Number");
                        number2 = scanner.nextDouble();
                        total = number1 - number2;
                        System.out.println(number1 + "-" + number2 + " = " + total);
                    } else if (firstSectionId == 3) {
                        double number1, number2, total;
                        System.out.println("Enter the first Number");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the second Number");
                        number2 = scanner.nextDouble();
                        total = number1 * number2;
                        System.out.println(number1 + "x" + number2 + " = " + total);
                    } else if (firstSectionId == 4) {
                        double number1, number2, total;
                        System.out.println("Enter the first Number");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the second Number");
                        number2 = scanner.nextDouble();
                        total = number1 / number2;
                        System.out.println(number1 + "/" + number2 + " = " + total);
                    }
                } // 4 basic operations block ends here.
                  // Trigonometrical and hyperbolic functions block starts here.
                else if (operationId == 2) {
                    int secondSectionId;
                    System.out.println("Enter 1 for trigonometrical functions");
                    System.out.println("Enter 2 for inverse trigonometrical functions");
                    System.out.println("Enter 3 for hyperbolic  functions");
                    System.out.println(">>");
                    secondSectionId = scanner.nextInt();
                    if (secondSectionId < 1 || secondSectionId > 3) {
                        System.out.println("Please enter a valid value");
                    } else if (secondSectionId == 1) {
                        while (true) {
                            String choosingOperation;
                            System.out.println("TRIGONOMETRICAL FUNCTIONS");
                            System.out.println("If you want to see the trigonometrical functions enter 'display'");
                            System.out.println(
                                    "If you want to use the trigonometrical functions directly enter 'action'");
                            System.out.println(
                                    "If you want to exit from the trigonometrical and hyperbolic functions page  enter 'exit'");
                            System.out.println(">>");
                            choosingOperation = scanner.next();
                            if (choosingOperation.equals("display")) {
                                System.out.println("Sin(x)");
                                System.out.println("Tan(x)");
                                System.out.println("Cot(x)");
                                System.out.println("Sec(x)");
                                System.out.println("Cosec(x)");
                                continue;
                            } else if (choosingOperation.equals("action")) {
                                double theta;
                                System.out.println("Please enter a degree");
                                theta = scanner.nextDouble();
                                System.out.println("cos" + "(" + theta + ")" + " = " + Math.cos(theta));
                                System.out.println("sin" + "(" + theta + ")" + " = " + Math.sin(theta));
                                System.out.println("tan" + "(" + theta + ")" + " = " + Math.tan(theta));
                                continue;
                            } else if (choosingOperation.equals("exit")) {
                                break;
                            }
                        }
                    } else if (secondSectionId == 2) {
                        while (true) {
                            String choosingOperation;
                            System.out.println("INVERSE TRIGONOMETRICAL FUNCTIONS");
                            System.out.println(
                                    "If you want to see the inverse trigonometrical functions enter 'display' ");
                            System.out.println(
                                    "If you want to use the inverse trigonometrical functions directly enter 'action");
                            System.out.println(
                                    "If you want to exit from the trigonometrical and hyperbolic functions page enter 'exit' ");
                            choosingOperation = scanner.next();
                            if (choosingOperation.equals("display")) {
                                System.out.println("Arccos(x)");
                                System.out.println("Arcsin(x)");
                                System.out.println("Arctan(x)");
                                System.out.println("Arcsec(x)");
                                System.out.println("Arccosec(x)");
                                continue;
                            } else if (choosingOperation.equals("action")) {
                                double theta;
                                System.out.println("Please enter a degree");
                                theta = scanner.nextDouble();
                                System.out.println("Arccos" + "(" + theta + ")" + " = " + Math.acos(theta));
                                System.out.println("Arcsin" + "(" + theta + ")" + " = " + Math.asin(theta));
                                System.out.println("Arctan" + "(" + theta + ")" + " = " + Math.atan(theta));
                                continue;
                            } else if (choosingOperation.equals("exit")) {
                                break;
                            }
                        }
                    } else if (secondSectionId == 3) {
                        while (true) {
                            String choosingOperation;
                            System.out.println("HYPERBOLIC FUNCTIONS");
                            System.out.println("If you want to see the hyperbolic functions enter 'display' ");
                            System.out.println("If you want to use hyperbolic functions directly enter 'action' ");
                            System.out.println(
                                    "If you want to exit from trigonometrical and hyperbolic functions page enter 'exit' ");
                            choosingOperation = scanner.next();
                            if (choosingOperation.equals("display")) {
                                System.out.println("cosh(x)");
                                System.out.println("sinh(x)");
                                System.out.println("tanh(x)");
                                System.out.println("coth(x)");
                                System.out.println("sech(x)");
                                System.out.println("csch(x)");
                                continue;
                            } else if (choosingOperation.equals("action")) {
                                double theta;
                                theta = scanner.nextDouble();
                                System.out.println("cosh" + "(" + theta + ")" + " = " + Math.cosh(theta));
                                System.out.println("sinh" + "(" + theta + ")" + " = " + Math.sinh(theta));
                                System.out.println("tanh" + "(" + theta + ")" + " = " + Math.tanh(theta));
                                continue;
                            } else if (choosingOperation.equals("exit")) {
                                break;
                            }
                        }
                    }
                } // Trigonometrical and hyperbolic functions block ends here.
                  // Operations on the integers block starts.
                else if (operationId == 3) {
                    while (true) {
                        String choosingOperation;
                        System.out.println(
                                "I you want to see the operations that you can with integers enter 'display' ");
                        System.out.println(
                                "I you want to use the operations that you can with integers directly enter 'action' ");
                        System.out.println("I you want to exit from the operations with integers page enter 'exit' ");
                        System.out.println(">>");
                        choosingOperation = scanner.next();
                        if (choosingOperation.equals("display")) {
                            System.out.println("|x|: absolute value");
                            System.out.println("sqrt(x) function: square root of x");
                            continue;
                        } else if (choosingOperation.equals("action")) {
                            double number, squareRoot, absoluteValue;
                            System.out.println("Please enter a number :");
                            number = scanner.nextDouble();
                            if (number > 0) {
                                squareRoot = Math.sqrt((number));
                                System.out.println("Square root of the" + number + "=" + squareRoot);
                                absoluteValue = Math.abs(number);
                                System.out.println("Absolute value of the" + number + "=" + absoluteValue);
                            } else {
                                System.out.println(
                                        "The number cannot be negative if you want to calculate square root of it.");
                                System.out.println("But you can calculate the absolute value of it :");
                                absoluteValue = Math.abs(number);
                                System.out.println("Absolute value of the" + number + "=" + absoluteValue);
                            }
                            continue;
                        } else if (choosingOperation.equals("exit")) {
                            break;
                        }
                    }
                } // Operations on the integers block ends here.
                  // Logarithmical and exponential functions block starts here.
                else if (operationId == 4) {
                    while (true) {
                        String choosingOperation;
                        System.out.println(
                                "If you want to see the logarithmical and exponential functions enter 'display' ");
                        System.out.println(
                                "If you want use the logarithmical and exponential functions directly enter 'action' ");
                        System.out.println(
                                "If you want to exit from the logarithmical and exponential functions page enter 'exit' ");
                        System.out.println(">>");
                        choosingOperation = scanner.next();
                        if (choosingOperation.equals("display")) {
                            System.out.println("ln(x): Natural log of x");
                            System.out.println("log10(x): Logarithm in base 10");
                            System.out.println("exp(x): e^x");
                            System.out.println("pow(x, y): x^y");
                            continue;
                        } else if (choosingOperation.equals("action")) {
                            while (true) {
                                double firstNumber, secondNumber;
                                System.out.println("Please enter a number :");
                                firstNumber = scanner.nextDouble();
                                if (firstNumber <= 0) {
                                    String answer;
                                    System.out.println("The number that you entered is not a valid value.");
                                    System.out.println("But, you can use the pow(x, y) function for that number.");
                                    System.out.println("Do you want use that function? Yes or No?");
                                    System.out.println(">>");
                                    answer = scanner.next();
                                    if (answer != "Yes" || answer != "No") {
                                        System.out.println("Your answer is not valid.");
                                        break;
                                    } else if (answer.equals("Yes")) {
                                        System.out
                                                .println("Please enter a power of the first number that you entered.");
                                        System.out.println(">>");
                                        secondNumber = scanner.nextDouble();
                                        System.out.println("pow(x, y) :" + Math.pow(firstNumber, secondNumber));
                                        break;
                                    } else if (answer.equals("No")) {
                                        break;
                                    }
                                } else {
                                    System.out.println("ln(" + firstNumber + ") =" + Math.log(firstNumber));
                                    System.out.println("log10(" + firstNumber + ") =" + Math.log10(firstNumber));
                                    System.out.println("exp(" + firstNumber + ") =" + Math.exp(firstNumber));
                                }
                                break;
                            }
                        } else if (choosingOperation.equals("exit")) {
                            break;
                        }
                    }
                } // Logarithmical and exponential functions block ends here.
                continue;
            } else if (progress.equals("exit")) {
                break;
            }
            scanner.close();
        }
    }
}
