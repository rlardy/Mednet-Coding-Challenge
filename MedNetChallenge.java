import java.util.Scanner;

class MedNetChallenge {
    /*
     * The code below will convert between temperatures for Kelvin, Celsius,
     * Fahrenheit, and Rankine
     */
    private static double CtoK(double celsius) {
        return celsius + 273;
    }

    private static double CtoF(double celsius) {
        return celsius * (1.8) + 32;
    }

    private static double CtoR(double celsius) {
        return celsius * (1.8) + 491.67;
    }

    private static double FtoC(double fahrenheit) {
        return (fahrenheit - 32) * (5 / 9);
    }

    private static double FtoK(double fahrenheit) {
        return (fahrenheit - 32) * (5 / 9) + 273;
    }

    private static double FtoR(double fahrenheit) {
        return fahrenheit + 459.67;
    }

    private static double KtoC(double kelvin) {
        return kelvin - 273;
    }

    private static double KtoF(double kelvin) {
        return (kelvin - 273) * (5 / 9) + 32;
    }

    private static double KtoR(double kelvin) {
        return kelvin * 1.8;
    }

    private static double RtoC(double rankine) {
        return (rankine - 491.67) * (5 / 9);
    }

    private static double RtoF(double rankine) {
        return rankine - 459.67;
    }

    private static double RtoK(double rankine) {
        return rankine * (5 / 9);
    }

    /*
     * The code below will allow for user input in order to grade temperature
     * conversions
     */
    public static void main(String[] args) {
        // local variables that have to be initialized
        boolean invalid = false;
        String grade = "";
        double answer = -1;
        // local vars
        String startingUnit;
        double inputTemp;
        double studentResponse;
        // Initialize scanner to get user input
        Scanner sc = new Scanner(System.in);
        // Get User input 1 (Input Temp)
        System.out.println("Enter Input Temperature: ");
        // Input Validation: Input temp must be an number, followed by unit type
        try {
            inputTemp = sc.nextFloat();
            startingUnit = sc.next();
            if (!startingUnit.equals("Kelvin") && !startingUnit.equals("Celsius") && !startingUnit.equals("Fahrenheit")
                    && !startingUnit.equals("Rankine")) {
                invalid = true;
            }
        } catch (Exception e) {
            invalid = true;
            startingUnit = "Kelvin";
            inputTemp = -1;
        }
        System.out.println("Enter Target Units: ");
        // Input Validation: A valid unit must be selected (assumed from example
        // scenarios)
        while (!sc.hasNext("Kelvin") && !sc.hasNext("Celsius") && !sc.hasNext("Fahrenheit") && !sc.hasNext("Rankine")) {
            sc.nextLine();
            System.err.println("Input is not a valid unit. Please enter a valid temperature unit.");
        }
        String targetUnit = sc.next();

        System.out.println("Enter Student Response: ");
        // Input Validation: Input temp must be an number
        try {
            studentResponse = sc.nextFloat();
        } catch (Exception e) {
            // Causes student response to be incorrect
            studentResponse = 0.0;
        }
        // Check for invalid/incorrect grade to skip calculations
        if (!invalid) {
            if (startingUnit.equals("Kelvin")) {
                if (targetUnit.equals("Celsius")) {
                    answer = KtoC(inputTemp);
                } else if (targetUnit.equals("Fahrenheit")) {
                    answer = KtoF(inputTemp);
                } else if (targetUnit.equals("Rankine")) {
                    answer = KtoR(inputTemp);
                } else if (targetUnit.equals("Kelvin")) {
                    answer = inputTemp;
                }
            } else if (startingUnit.equals("Celsius")) {
                if (targetUnit.equals("Celsius")) {
                    answer = inputTemp;
                } else if (targetUnit.equals("Fahrenheit")) {
                    answer = CtoF(inputTemp);
                } else if (targetUnit.equals("Rankine")) {
                    answer = CtoR(inputTemp);
                } else if (targetUnit.equals("Kelvin")) {
                    answer = CtoK(inputTemp);
                }
            } else if (startingUnit.equals("Fahrenheit")) {
                if (targetUnit.equals("Celsius")) {
                    answer = FtoC(inputTemp);
                } else if (targetUnit.equals("Fahrenheit")) {
                    answer = inputTemp;
                } else if (targetUnit.equals("Rankine")) {
                    answer = FtoR(inputTemp);
                } else if (targetUnit.equals("Kelvin")) {
                    answer = FtoK(inputTemp);
                }
            } else if (startingUnit.equals("Rankine")) {
                if (targetUnit.equals("Celsius")) {
                    answer = RtoC(inputTemp);
                } else if (targetUnit.equals("Fahrenheit")) {
                    answer = RtoF(inputTemp);
                } else if (targetUnit.equals("Rankine")) {
                    answer = inputTemp;
                } else if (targetUnit.equals("Kelvin")) {
                    answer = RtoK(inputTemp);
                }
            }
        }
        // GRADING
        if (invalid) {
            System.out.println("invalid");
        } else {
            // round answers to ones place and compare numbers to determine correctness
            if ((int) studentResponse == (int) answer) {
                grade = "correct";
            } else {
                grade = "incorrect";
            }
            System.out.println(grade);
        }
        sc.close();
    }
}