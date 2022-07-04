public class Homework4 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];


//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();





//        0
//          0
//            0
//              0
//                0

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();



//                0
//              0
//            0
//          0
//        0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j == 4) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();



//        0
//        0 0
//        0 0 0
//        0 0 0 0
//        0 0 0 0 0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i >= j) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();



//
//        0 0 0 0 0
//          0 0 0 0
//            0 0 0
//              0 0
//                0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i <= j) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();





//
//        0 0 0 0 0
//        0 0 0 0
//        0 0 0
//        0 0
//        0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j < 5) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();






//
//            0
//          0 0
//        0 0 0
//      0 0 0 0
//    0 0 0 0 0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j >= 4) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();






//        0
//        0 0
//        0 0 0
//        0 0
//        0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i >= j && i + j <= 4) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();





//           0
//         0 0
//       0 0 0
//         0 0
//           0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i <= j && i + j >= 4) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();






//        0 0 0 0 0
//          0 0 0
//            0
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i <= j && i + j <= 4) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();







//            0
//          0 0 0
//        0 0 0 0 0
//
//
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i >= j && i + j >= 4) {
                    System.out.print(a[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }





    }
}
