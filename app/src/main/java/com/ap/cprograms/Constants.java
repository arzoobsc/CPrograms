package com.ap.cprograms;

public class Constants {

    Constants (){}



    static final String Vowel_Consonant =
            "/* Vowel or Consonant */\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "    char ch;\n" +
                    "\n" +
                    "    printf(\"Enter an alphabet: \");\n" +
                    "    scanf(\"%c\", &ch);\n" +
                    "\n" +
                    "    switch (ch)\n" +
                    "    {\n" +
                    "    case 'a':\n" +
                    "    case 'A':\n" +
                    "    case 'e':\n" +
                    "    case 'E':\n" +
                    "    case 'i':\n" +
                    "    case 'I':\n" +
                    "    case 'o':\n" +
                    "    case 'O':\n" +
                    "    case 'u':\n" +
                    "    case 'U':\n" +
                    "\n" +
                    "        printf(\"\\t%c is Vowel\", ch);\n" +
                    "        break;\n" +
                    "\n" +
                    "    default:\n" +
                    "        printf(\"\\t%c is Consonant\", ch);\n" +
                    "        break;\n" +
                    "    }\n" +
                    "}\n" +
                    "/* \n" +
                    "    Output =>\n" +
                    "Enter an alphabet: D\n" +
                    "        D is Consonant\n" +
                    " */\n";

    public static final String Addition_UserInput =
            "/* Addition of two number using userinput */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a, b, sum;\n" +
                    "\n" +
                    "    printf(\"Enter two Integers  ::\");\n" +
                    "    scanf(\"%d %d\",&a,&b);   //  Store input value to a and b\n" +
                    "\n" +
                    "    sum = a+b;\n" +
                    "    printf(\"The Sum of %d and %d is %d\",a,b,sum);\n" +
                    "\n" +
                    "} \n" +
                    "/* \n" +
                    "Output =>\n" +
                    "Enter two Integers  ::5 6\n" +
                    "The Sum of 5 and 6 is 11\n" +
                    "*/\n";
    public static final String HelloWorld =
            "\n" +
                    "/* Hello World Program in C */\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "\n" +
                    "    printf(\"Hello, World!\");\n" +
                    "\n" +
                    "}\n" +
                    "// Output => Hello, World!" +
                    "\n";
    public static final String Addition_1 =
            "/* Addition Program */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a = 5,b = 9,sum;\n" +
                    "\n" +
                    "    sum = a+b;\n" +
                    "    printf(\"The Sum of %d and %d is %d\",a,b,sum);\n" +
                    "\n" +
                    "}\n" +
                    "//  Output =>   The Sum of 5 and 9 is 14" +
                    "\n";
    static final String Quotient_Remainder =
            "/* Quotient and Remainder */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "\n" +
                    "    int dividend, divisor, quotient, remainder;\n" +
                    "\n" +
                    "    printf(\"Enter Dividend ::\");\n" +
                    "    scanf(\"%d\", &dividend);\n" +
                    "\n" +
                    "    printf(\"Enter Divisor ::\");\n" +
                    "    scanf(\"%d\", &divisor);\n" +
                    "\n" +
                    "    if (divisor == 0)\n" +
                    "    {\n" +
                    "        printf(\"Enter Valid Input !!!\");\n" +
                    "    }else{\n" +
                    "        quotient = dividend / divisor;\n" +
                    "        remainder = dividend % divisor;\n" +
                    "\n" +
                    "        printf(\"\\tQuotient = %d\\n\",quotient);\n" +
                    "        printf(\"\\tRemainder = %d\\n\",remainder);\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "/* \n" +
                    "    Output =>\n" +
                    "Enter Dividend ::33\n" +
                    "Enter Divisor ::6\n" +
                    "        Quotient = 5\n" +
                    "        Remainder = 3\n" +
                    " */" +
                    "\n";
    static final String Print_ASCII =
            "/* Print ASCII value */\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "    char ch;\n" +
                    "    printf(\"Enter a character :: \");\n" +
                    "    scanf(\"%c\", &ch);\n" +
                    "\n" +
                    "    printf(\"ASCII value of %c = %d\", ch, ch);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter a character :: C\n" +
                    "ASCII value of C = 67\n" +
                    "*/" +
                    "\n";
    static final String Percent_Of_Marks =
            "/* Percentage of Your marks */\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "    int no, totalMarks, obtainedMarks = 0;\n" +
                    "    float percentage;\n" +
                    "    int sub[100];\n" +
                    "\n" +
                    "    printf(\"Enter Number of Subjects ::\");\n" +
                    "    scanf(\"%d\", &no);\n" +
                    "\n" +
                    "    printf(\"\\tEnter %d Subjects marks ::\", no);\n" +
                    "    for (int i = 0; i < no; i++)\n" +
                    "    {\n" +
                    "        scanf(\"%d\", &sub[i]);\n" +
                    "\n" +
                    "        obtainedMarks = obtainedMarks + sub[i];\n" +
                    "    }\n" +
                    "    totalMarks = 100 * no;\n" +
                    "    percentage = (obtainedMarks * 100) / (float)totalMarks; // usin (float) we get decimal or change 100 to 100.0\n" +
                    "    printf(\"Marks Obtained in %d Subjects :: %d\", no, obtainedMarks);\n" +
                    "    printf(\"\\n\\tPercentage ::%.2f\", percentage);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Number of Subjects ::5\n" +
                    "        Enter 5 Subjects marks ::90 87 85 75 79\n" +
                    "Marks Obtained in 5 Subjects :: 416\n" +
                    "        Percentage ::83.20\n" +
                    "*/\n";
    static final String Grade_Of_Marks =
            "/* Evaluate Grade of your marks */\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "    float marks;\n" +
                    "\n" +
                    "    printf(\"Enter Your Marks ::\");\n" +
                    "    scanf(\"%f\", &marks);\n" +
                    "\n" +
                    "    if (marks > 100 || marks < 1)\n" +
                    "    {\n" +
                    "        printf(\"Please Enter valid Marks\");\n" +
                    "    }\n" +
                    "    else if (marks >= 90)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is O\");\n" +
                    "    }\n" +
                    "    else if (marks >= 80)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is A+\");\n" +
                    "    }\n" +
                    "    else if (marks >= 70)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is A\");\n" +
                    "    }\n" +
                    "    else if (marks >= 60)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is B+\");\n" +
                    "    }\n" +
                    "    else if (marks >= 50)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is B\");\n" +
                    "    }\n" +
                    "    else if (marks >= 40)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is C\");\n" +
                    "    }\n" +
                    "    else if (marks >= 30)\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is P\");\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        printf(\"Your Grade is F\");\n" +
                    "    }\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Your Marks ::70\n" +
                    "Your Grade is A\n" +
                    "*/\n";
    static final String Swap_Two_Number =
            "/* Swapping Two Numbers */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a, b, temp;\n" +
                    "\n" +
                    "    printf(\"Enter a and b ::\");\n" +
                    "    scanf(\"%d %d\",&a,&b);\n" +
                    "\n" +
                    "    printf(\"\\nBefore Swapping\\n\");\n" +
                    "    printf(\"a = %d \\nb = %d\",a,b);\n" +
                    "\n" +
                    "    temp = a;\n" +
                    "    a = b;\n" +
                    "    b = temp;\n" +
                    "\n" +
                    "    printf(\"\\nAfter Swapping\\n\");\n" +
                    "    printf(\"a = %d \\nb = %d\",a,b);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter a and b ::6 3\n" +
                    "\n" +
                    "Before Swapping\n" +
                    "a = 6\n" +
                    "b = 3\n" +
                    "After Swapping\n" +
                    "a = 3\n" +
                    "b = 6\n" +
                    "*/\n";
    static final String Greatest_A_3 =
            "/* Greatest Among 3 Numbers */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a,b,c;\n" +
                    "\n" +
                    "    printf(\"Enter Three number ::\");\n" +
                    "    scanf(\"%d %d %d\",&a,&b,&c);\n" +
                    "    \n" +
                    "    if (a > b && a > c)\n" +
                    "    {\n" +
                    "        printf(\"\\tGreatest Number is %d\",a);\n" +
                    "    }\n" +
                    "    else if (b > c)\n" +
                    "    {\n" +
                    "        printf(\"\\tGreatest Number is %d\",b);\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        printf(\"\\tGreatest Number is %d\",c);\n" +
                    "    }\n" +
                    "    \n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Three number ::2 9 3\n" +
                    "        Greatest Number is 9\n" +
                    "*/\n";
    static final String Greatest_Using_Ternary =
            "\n" +
                    "/* Greatest in two Number using Ternary operator */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a, b, c;\n" +
                    "\n" +
                    "    printf(\"Enter Two Numbers ::\");\n" +
                    "    scanf(\"%d %d\",&a,&b);\n" +
                    "\n" +
                    "    c = (a > b) ? a : b;\n" +
                    "\n" +
                    "    printf(\"Greatest number is %d\",c);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Two Numbers ::9 4\n" +
                    "Greatest number is 9\n" +
                    "*/\n";
    static final String Sum_Range =
            "/* Sum in a range */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a, b, sum = 0;\n" +
                    "\n" +
                    "\n" +
                    "    printf(\"Enter the the Range ::\");\n" +
                    "    scanf(\"%d %d\",&a,&b);\n" +
                    "\n" +
                    "    for (int i = a; i <=b; i++)\n" +
                    "    {\n" +
                    "        sum = sum + i;\n" +
                    "    }\n" +
                    "    printf(\"Total Sum = %d\",sum);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter the the Range ::1 5\n" +
                    "Total Sum = 15\n" +
                    "*/\n";
    static final String Odd_Even_Range =
            "/* Odd Even in a range */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a, b;\n" +
                    "\n" +
                    "\n" +
                    "    printf(\"Enter the the Range ::\");\n" +
                    "    scanf(\"%d %d\",&a,&b);\n" +
                    "\n" +
                    "    for (int i = a; i <=b; i++)\n" +
                    "    {\n" +
                    "        if (i%2 == 0)\n" +
                    "        {\n" +
                    "            printf(\"\\n%d is EVEN\",i);\n" +
                    "        }else\n" +
                    "        {\n" +
                    "            printf(\"\\n\\t%d is ODD\",i);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter the the Range ::1 10\n" +
                    "\n" +
                    "        1 is ODD\n" +
                    "2 is EVEN\n" +
                    "        3 is ODD\n" +
                    "4 is EVEN\n" +
                    "        5 is ODD\n" +
                    "6 is EVEN\n" +
                    "        7 is ODD\n" +
                    "8 is EVEN\n" +
                    "        9 is ODD\n" +
                    "10 is EVEN\n" +
                    "*/\n";
    static final String Simple_Calculator =
            "\n" +
                    "/* Simple Calculator */\n" +
                    "#include <stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "    float a, b, result;\n" +
                    "    char op;\n" +
                    "\n" +
                    "    printf(\"Enter Two Numbers ::\");\n" +
                    "    scanf(\"%f %f\", &a, &b);\n" +
                    "\n" +
                    "    printf(\"Enter an Operator (+, -, *, /) ::\");\n" +
                    "    scanf(\" %c\", &op);\n" +
                    "\n" +
                    "    switch (op)\n" +
                    "    {\n" +
                    "    case '+':\n" +
                    "        result = a + b;\n" +
                    "        printf(\"%.2f + %.2f = %.2f\\n\", a, b, result);\n" +
                    "        break;\n" +
                    "    case '-':\n" +
                    "        result = a - b;\n" +
                    "        printf(\"%.2f - %.2f = %.2f\\n\", a, b, result);\n" +
                    "        break;\n" +
                    "    case '*':\n" +
                    "        result = a * b;\n" +
                    "        printf(\"%.2f * %.2f = %.2f\\n\", a, b, result);\n" +
                    "        break;\n" +
                    "    case '/':\n" +
                    "        result = a / b;\n" +
                    "        printf(\"%.2f / %.2f = %.2f\\n\", a, b, result);\n" +
                    "        break;\n" +
                    "    default:\n" +
                    "        printf(\"Invalid Operator Selected\");\n" +
                    "        break;\n" +
                    "    }\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Two Numbers ::9.2 8.6\n" +
                    "Enter an Operator (+, -, *, /) ::*\n" +
                    "9.20 * 8.60 = 79.12\n" +
                    "*/\n";
    static final String Add_S_M_Divide =
            "\n" +
                    "/* Add, Sub, Multiply and Divide */\n" +
                    "#include<stdio.h>\n" +
                    "void main(){\n" +
                    "    float a,b,sum,sub,multiply,divide;\n" +
                    "\n" +
                    "    printf(\"Enter Two Numbers ::\");\n" +
                    "    scanf(\"%f %f\",&a,&b);\n" +
                    "\n" +
                    "    sum = a + b;\n" +
                    "    sub = a - b;\n" +
                    "    multiply = a * b;\n" +
                    "    divide = a / b;\n" +
                    "\n" +
                    "    printf(\"Sum = %.2f\\n\",sum);\n" +
                    "    printf(\"Sub = %.2f\\n\",sub);\n" +
                    "    printf(\"Multiplication = %.2f\\n\",multiply);\n" +
                    "    printf(\"Division = %.2f\\n\",divide);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Two Numbers ::6.8 7.6\n" +
                    "Sum = 14.40\n" +
                    "Sub = -0.80\n" +
                    "Multiplication = 51.68\n" +
                    "Division = 0.89\n" +
                    "*/\n";
    static final String Odd_Even =
            "/* Odd Even Program */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "void main(){\n" +
                    "    int no;\n" +
                    "\n" +
                    "    printf(\"Enter an Integer ::\");\n" +
                    "    scanf(\"%d\",&no);\n" +
                    "\n" +
                    "    if (no%2 == 0)\n" +
                    "    {\n" +
                    "        printf(\"%d is EVEN\",no);\n" +
                    "    }else\n" +
                    "    {\n" +
                    "        printf(\"%d is ODD\",no);\n" +
                    "    }\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter an Integer ::9\n" +
                    "9 is ODD\n" +
                    "*/\n";
    static final String Area_Of_Circle =
            "/* Area of a Circle */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "void main(){\n" +
                    "    float r,area;\n" +
                    "\n" +
                    "    printf(\"Enter radius of Circle ::\");\n" +
                    "    scanf(\"%f\",&r);\n" +
                    "\n" +
                    "    area = (22 * r * r)/7;\n" +
                    "    printf(\"Area of Circle :: %.2f\",area);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter radius of Circle ::2\n" +
                    "Area of Circle :: 12.57\n" +
                    "*/" + "\n";
    static final String Subtraction_UI =
            "/* Sutraction program */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    float a,b,sub;\n" +
                    "\n" +
                    "    printf(\"Enter Two Numbers  ::\");\n" +
                    "    scanf(\"%f %f\",&a,&b);\n" +
                    "\n" +
                    "    sub = a - b;\n" +
                    "    printf(\"Subtraction of %.2f and %.2f is %.2f\",a,b,sub);\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter Two Numbers  ::5.9 4.8\n" +
                    "Subtraction of 5.90 and 4.80 is 1.10\n" +
                    "*/" +
                    "\n";
    static final String Subtraction_1 =
            "/* Sbtraction Program */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    int a = 5, b = 9, sub;\n" +
                    "\n" +
                    "    sub = a - b;\n" +
                    "    printf(\"The Subtraction of %d and %d is %d\",a,b,sub);\n" +
                    "\n" +
                    "}\n" +
                    "//  Output =>   The Subtraction of 5 and 9 is -4" +
                    "\n";
    static final String Addition_Floating_Integer_UI =
            "/* Addition of two Floating point Numbers */\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main(){\n" +
                    "    float a,b,sum;\n" +
                    "\n" +
                    "    printf(\"Enter two Numbers   ::\");\n" +
                    "    scanf(\"%f %f\",&a,&b);\n" +
                    "\n" +
                    "    sum = a+b;\n" +
                    "    printf(\"The Sum of %.2f and %.2f is %.2f\",a,b,sum);\n" +
                    "\n" +
                    "}\n" +
                    "/*\n" +
                    "    Output =>\n" +
                    "Enter two Numbers   ::5.6 9.2\n" +
                    "The Sum of 5.60 and 9.20 is 14.80\n" +
                    "*/\n";

}
