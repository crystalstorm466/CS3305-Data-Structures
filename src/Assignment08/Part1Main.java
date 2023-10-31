//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment 08-BTs
package Assignment08;


public class Part1Main {
    public static void main(String[] args) {
        System.out.println("[Binary Tree]");

        //Sample One Tree
        double[] preone = { 2, 1, 3};
        double[] inone = {1, 2, 3};
        int paraone = 3;
        System.out.println("Tree Name: sampleOne");
        BinaryTree sampleOne = new BinaryTree();
        sampleOne.root = sampleOne.buildTree(inone, preone, 0, preone.length-1); //make a new binary tree with the in and pre order traversals
        sampleOne.printInorder(sampleOne.root);

        //Test the methods
        System.out.println("Depth: " + sampleOne.depth(sampleOne.root));
        System.out.println("Max: " + sampleOne.max(sampleOne.root));
        System.out.println("Sum: " + sampleOne.tree_sum(sampleOne.root));
        System.out.println("Average: " + sampleOne.tree_average(sampleOne.root));
       System.out.println("Is Balanced? " + sampleOne.tree_is_balanced(sampleOne.root));
       System.out.println("Is it a BST?: "+ sampleOne.isBST(sampleOne.root, 0, preone.length-1));

       //Sample Two Trees
        double[] pretwo = { 1, 2, 4, 8, 5, 9, 3, 6, 10, 11, 7, 12};
        double[] intwo = {8, 4, 2, 9, 5, 1, 10, 6, 11, 3, 12, 7};
        System.out.println("Tree Name: sampleTwo");
        BinaryTree sampleTwo = new BinaryTree();
        sampleTwo.root = sampleTwo.buildTree(intwo, pretwo, 0, pretwo.length-1); //make a new binary tree with the in and pre order traversals
        sampleTwo.printInorder(sampleTwo.root);

        //Test the methods
        System.out.println("Depth: " + sampleTwo.depth(sampleTwo.root));
        System.out.println("Max: " + sampleTwo.max(sampleTwo.root));
        System.out.println("Sum: " + sampleTwo.tree_sum(sampleTwo.root));
        System.out.println("Average: " + sampleTwo.tree_average(sampleTwo.root));
        System.out.println("Is Balanced? " + sampleTwo.tree_is_balanced(sampleTwo.root));
        System.out.println("Is it a BST?: "+ sampleTwo.isBST(sampleTwo.root, 0, pretwo.length-1));


        //Sample Three Trees
        double[] prethree = {0.185038, 0.394342, 0.291092, 0.289448, 0.101709, 0.0611125, 0.193208, 0.13517, 0.0404296, 0.410769, 0.0198583, 0.432688, 0.0674109, 0.151873, 0.14349, 0.286818, 0.071119, 0.170354, 0.0670367, 0.44319, 0.0682843, 0.270964, 0.369207, 0.461848, 0.427017, 0.377756, 0.0485934, 0.0667142, 0.108895, 0.153658, 0.00263633, 0.222634, 0.094924, 0.195702, 0.170448, 0.364803, 0.378102, 0.440015, 0.147172, 0.0208332, 0.340395, 0.131731, 0.275594, 0.390628, 0.317047, 0.108642, 0.393182, 0.307225, 0.159842, 0.292226, 0.126009, 0.363135, 0.183877, 0.228193, 0.449523, 0.042972, 0.462529};
        double[] inthree = {0.193208, 0.13517, 0.0611125, 0.101709, 0.289448, 0.410769, 0.0198583, 0.151873, 0.0674109, 0.432688, 0.0404296, 0.286818, 0.071119, 0.170354, 0.44319, 0.0670367, 0.14349, 0.291092, 0.0682843, 0.270964, 0.394342, 0.377756, 0.427017, 0.461848, 0.0485934, 0.369207, 0.108895, 0.153658, 0.00263633, 0.0667142, 0.195702, 0.094924, 0.170448, 0.222634, 0.378102, 0.364803, 0.440015, 0.0208332, 0.147172, 0.185038, 0.275594, 0.307225, 0.393182, 0.108642, 0.317047, 0.390628, 0.131731, 0.292226, 0.126009, 0.159842, 0.340395, 0.183877, 0.228193, 0.363135, 0.042972, 0.449523, 0.462529};
        System.out.println("Tree Name: sampleThree");
        BinaryTree sampleTh = new BinaryTree();
        sampleTh.root = sampleTh.buildTree(inthree, prethree, 0, prethree.length-1); //make a new binary tree with the in and pre order traversals
        sampleTh.printInorder(sampleTh.root);

        //Test the methods
        System.out.println("Depth: " + sampleTh.depth(sampleTh.root));
        System.out.println("Max: " + sampleTh.max(sampleTh.root));
        System.out.println("Sum: " + sampleTh.tree_sum(sampleTh.root));
        System.out.println("Average: " + sampleTh.tree_average(sampleTh.root));
        System.out.println("Is Balanced? " + sampleTh.tree_is_balanced(sampleTh.root));
        System.out.println("Is it a BST?: "+ sampleTh.isBST(sampleTh.root, 0, prethree.length-1));


        //Sample Four Trees
        double[] prefour = {0.0548774, 0.0219107, 0.399846, 0.11906, 0.276626, 0.0025399, 0.0871276, 0.414861, 0.245851,  0.326767, 0.299142, 0.177023, 0.374845, 0.308614, 0.0240217, 0.372271, 0.455955, 0.0612401,  0.335461, 0.435828, 0.0312264, 0.0884601, 0.159796, 0.454999, 0.219714, 0.197132, 0.0369807,  0.11951, 0.241231, 0.413826, 0.184522, 0.0199605, 0.257216, 0.222754, 0.272094, 0.425897, 0.46714,  0.0668064, 0.132584, 0.305703, 0.359778, 0.368871, 0.203195, 0.204924, 0.258112, 0.488894, 0.18149,  0.0354453, 0.140185, 0.130067, 0.411766, 0.376441, 0.129284, 0.184723, 0.478379, 0.371205, 0.158867,  0.487457, 0.234737, 0.00210605, 0.340738, 0.356701, 0.349852, 0.450229, 0.148242, 0.393779,0.24513,};
        double[] infour = {0.276626, 0.0871276, 0.0025399, 0.414861, 0.245851, 0.11906, 0.326767, 0.399846, 0.299142, 0.335461, 0.0612401, 0.455955, 0.372271, 0.0240217, 0.308614, 0.374845, 0.177023, 0.0312264, 0.0884601, 0.159796, 0.435828, 0.0219107, 0.219714, 0.0369807, 0.413826, 0.241231, 0.11951, 0.184522, 0.197132, 0.222754, 0.257216, 0.0199605, 0.454999, 0.0668064, 0.132584, 0.46714, 0.305703, 0.425897, 0.368871, 0.359778, 0.272094, 0.258112, 0.204924, 0.203195, 0.0548774, 0.0354453, 0.130067, 0.129284, 0.376441,                    0.411766, 0.140185, 0.18149, 0.184723, 0.371205, 0.158867, 0.478379, 0.487457, 0.488894, 0.00210605, 0.234737, 0.450229, 0.349852, 0.356701, 0.340738, 0.24513, 0.393779, 0.148242,};
        int parafour = 67;
        System.out.println("Tree Name: sampleFour");
        BinaryTree sampleFour = new BinaryTree();
        sampleFour.root = sampleFour.buildTree(infour, prefour, 0, prefour.length-1); //make a new binary tree with the in and pre order traversals
        sampleFour.printInorder(sampleFour.root);

        System.out.println("Depth: " + sampleFour.depth(sampleFour.root));
        System.out.println("Max: " + sampleFour.max(sampleFour.root));
        System.out.println("Sum: " + sampleFour.tree_sum(sampleFour.root));
        System.out.println("Average: " + sampleFour.tree_average(sampleFour.root));
        System.out.println("Is Balanced? " + sampleFour.tree_is_balanced(sampleFour.root));
        System.out.println("Is it a BST?: "+ sampleFour.isBST(sampleFour.root, 0, prefour.length-1));

        //Sample Five Trees

        double[] prefive = {73.4985, 46.8521, 14.3886, 12.9232, 85.4859, 46.2981, 80.6752, 88.638, 4.35911, 58.6892, 84.1117, 40.5937, 68.0229, 61.445, 34.0708, 35.3704, 18.5848, 96.9019, 92.7016, 19.209, 23.4396, 91.8773, 30.3747, 77.7968, 61.8916, 88.8224, 53.4489, 95.265, 60.4812, 39.0774, 55.1742, 26.1048, 94.9729, 25.1438, 48.3416, 53.3558, 68.7762, 8.53748, 18.4463, 74.2923, 24.9243, 43.8824, 85.6614, 85.3082, 44.935, 76.962, 11.221, 49.8271, 2.35539, 71.8307, 89.2918, 8.40491, 61.8023, 21.7674, 14.0364, 64.5149, 69.6479, 39.7651, 14.1298, 56.2528, 34.85, 14.2238, 9.7598, 86.5377, 25.5708, 27.0339, 17.4183, 77.4411, 92.9552, 67.7474, 24.8433, 39.1404, 57.3637, 86.793, 79.4382, 71.3109, 29.2685, 3.97165, 49.9699, 0.527265, 56.5742, 76.9849, 97.5207, 71.6777, 70.8829, 35.2898, 88.0029, 5.02091, 5.96275, 75.6205, 98.4684, 96.2908, 63.8659, 77.8282, 75.5512, 17.7396, 67.5396, 28.6981, 12.2225, 38.7088, 16.4708, 92.5059, 82.1537, 94.3072, 14.5779, 51.7565, 43.5969, 72.9606, 1.56508, 9.78005, 18.9848, 45.6385, 13.969, 92.3696, 26.3461, 56.757, 91.198, 78.8685, 37.0075, 73.8415, 58.2184, 13.6569, 57.8895, 96.2489, 97.1185, 64.7039, 41.3069, 27.7655, 31.9683, 55.1188, 52.3135, 66.884, 83.9292, 58.4453, 78.1257, 1.43965, 44.5268, 29.4732, 85.4034, 3.31023, 8.08591, 54.1928, 41.5081, 40.9289, 43.1932, 77.7617, 9.87374, 8.39879, 20.0876, 47.2552, 27.5136, 26.8304, 45.1827, 86.6642, 13.2579, 72.1408, 33.1812, 9.41366, 89.4363, 76.2227, 72.4771, 34.8774, 16.4201, 30.744, 31.1552, 77.9852, 24.4572, 24.8563, 70.9599, 65.9745, 16.3165, 86.4168, 2.51523, 42.6039, 55.5835, 32.5931, 11.7524, 33.165, 87.6593, 6.77963, 44.2723, 16.1713, 36.9947, 43.9856, 60.1331, 14.8278, 95.1717, 8.84246, 6.33744, 38.8297, 79.0969, 33.7647, 3.20686, 12.2841, 11.0536, 28.8245, 11.1387, 14.6653, 43.1258, 9.30967, 49.7818, 33.2852, 23.1558, 66.5455, 33.6988, 69.4424, 1.39044, 94.2626, 57.0549, 40.6015, 99.6742, 54.4458, 79.7501, 92.6126, 10.4309, 50.9208, 67.283, 10.87, 24.4578, 28.0051, 21.931, 69.5968, 11.3731, 32.7579, 11.7431, 54.8151, 24.3329, 65.0133, 50.714, 68.4945, 38.0619, 99.3297, };
        double[] infive = {80.6752, 88.638, 46.2981, 58.6892, 4.35911, 84.1117, 40.5937, 85.4859, 18.5848, 35.3704, 34.0708, 96.9019, 61.445, 19.209, 92.7016, 68.0229, 91.8773, 23.4396, 77.7968, 30.3747, 12.9232, 53.4489, 95.265, 88.8224, 39.0774, 60.4812, 55.1742, 26.1048, 61.8916, 25.1438, 94.9729, 48.3416, 53.3558, 14.3886, 24.9243, 74.2923, 85.6614, 43.8824, 18.4463, 85.3082, 44.935, 8.53748, 11.221, 76.962, 49.8271, 2.35539, 68.7762, 61.8023, 8.40491, 89.2918, 21.7674, 71.8307, 64.5149, 14.0364, 46.8521, 34.85, 14.2238, 56.2528, 86.5377, 9.7598, 25.5708, 27.0339, 14.1298, 92.9552, 77.4411, 17.4183, 67.7474, 39.7651, 79.4382, 71.3109, 86.793, 29.2685, 57.3637, 49.9699, 3.97165, 39.1404, 56.5742, 76.9849, 0.527265, 97.5207, 24.8433, 35.2898, 70.8829, 71.6777, 5.96275, 5.02091, 88.0029, 75.6205, 69.6479, 75.5512, 77.8282, 17.7396, 67.5396, 63.8659, 16.4708, 38.7088, 12.2225, 92.5059, 28.6981, 94.3072, 82.1537, 96.2908, 51.7565, 43.5969, 14.5779, 9.78005, 1.56508, 72.9606, 18.9848, 98.4684, 91.198, 56.757, 37.0075, 78.8685, 26.3461, 73.8415, 58.2184, 92.3696, 57.8895, 13.6569, 96.2489, 97.1185, 13.969, 27.7655, 41.3069, 64.7039, 55.1188, 31.9683, 66.884, 52.3135, 45.6385, 78.1257, 58.4453, 1.43965, 44.5268, 83.9292, 3.31023, 8.08591, 85.4034, 54.1928, 29.4732, 40.9289, 41.5081, 73.4985, 20.0876, 8.39879, 27.5136, 47.2552, 9.87374, 45.1827, 86.6642, 26.8304, 72.1408, 13.2579, 9.41366, 33.1812, 77.7617, 34.8774, 72.4771, 16.4201, 30.744, 76.2227, 24.4572, 77.9852, 31.1552, 65.9745, 70.9599, 24.8563, 16.3165, 89.4363, 42.6039, 2.51523, 55.5835, 32.5931, 86.4168, 33.165, 11.7524, 43.1932, 36.9947, 16.1713, 44.2723, 60.1331, 43.9856, 95.1717, 14.8278, 6.77963, 38.8297, 6.33744, 33.7647, 79.0969, 8.84246, 28.8245, 11.0536, 12.2841, 11.1387, 3.20686, 43.1258, 14.6653, 87.6593, 66.5455, 23.1558, 69.4424, 33.6988, 33.2852, 1.39044, 94.2626, 49.7818, 99.6742, 40.6015, 57.0549, 54.4458, 9.30967, 10.4309, 50.9208, 92.6126, 10.87, 24.4578, 67.283, 28.0051, 79.7501, 32.7579, 11.3731, 11.7431, 54.8151, 69.5968, 24.3329, 65.0133, 21.931, 68.4945, 50.714, 38.0619, 99.3297, };
        int parafive = 232;
        System.out.println("Tree Name: sampleFive");
        BinaryTree sampleFive = new BinaryTree();
        sampleFive.root = sampleFive.buildTree(infive, prefive, 0, prefive.length-1); //make a new binary tree with the in and pre order traversals
        sampleFive.printInorder(sampleFive.root);

        //Test the methods
        System.out.println("Depth: " + sampleFive.depth(sampleFive.root));
        System.out.println("Max: " + sampleFive.max(sampleFive.root));
        System.out.println("Sum: " + sampleFive.tree_sum(sampleFive.root));
        System.out.println("Average: " + sampleFive.tree_average(sampleFive.root));
        System.out.println("Is Balanced? " + sampleFive.tree_is_balanced(sampleFive.root));
        System.out.println("Is it a BST?: "+ sampleFive.isBST(sampleFive.root, 0, prefive.length-1));


        //Sample Six Trees
        double[] presix = {4.3306, 3.11497, 52.1211, 19.2026, 9.15248, 72.7208, 63.34, 46.2895, 64.0222, 63.4586, 89.066, 6.59548, 77.8256, 58.3726, 56.1533, 9.88477, 16.6032, 40.6564, 57.7543, 47.04, 49.518, 10.2645, 31.9497, 43.5922, 41.82, 44.8016, 64.523, 49.381, 0.108398, 69.0608, 61.5658, 72.6547, 76.473, 13.687, 53.4604, 53.2735, 65.0492, 5.24228, 3.02872, 15.5814, 98.9001, 2.76773, 75.5567, 16.822, 44.2757, 38.2792, 57.4494, 21.5026, 34.1031, 85.1352, 66.3168, 85.1616, 88.2336, 1.42473, 54.6989, 79.3257, 55.4436, 16.0068, 70.3067, 58.1328, 94.856, 32.8399, 53.1079, 66.8505, 68.542, 17.2608, 95.6259, 98.8123, 86.1839, 24.7786, 60.8085, 78.4745, 83.0666, 47.5039, 20.8264, 99.1416, 53.0747, 73.3418, 92.6313, 59.81, 47.517, 58.8448, 25.433, 93.6073, 76.5438, 58.5274, 76.332, 58.2736, 51.0678, 73.0445, 22.4902, 41.7751, 92.9945, 94.4361, 75.4164, 43.6473, 17.5823, 85.6195, 16.3857, 0.697784, 53.8455, 18.7113, 7.07285, 22.9233, 27.7605, 34.3872, 93.5078, 12.7034, 12.428, 12.5186, 89.1598, 30.8344, 12.6001, 70.9641, 67.1992, 98.9208, 85.6052, 66.1593, 85.4261, 51.4584, 7.17516, 77.659, 4.9388, 32.3939, 6.3941, 13.7492, 85.891, 49.4464, 13.7305, 55.0002, 92.2876, 3.86547, 54.9294, 9.50294, 90.9076, 80.35, 39.546, 59.6445, 37.3981, 98.767, 16.7178, 11.0163, 62.2525, 78.6217, 3.21555, 37.2375, 31.2927, 22.3803, 63.1045, 74.0793, 68.7142, 10.6833, 24.3944, 90.4101, 1.71769, 8.02979, 6.38096, 2.14237, 64.0517, 63.2271, 34.2695, 92.1689, 33.2269, 76.1078, 62.6672, 46.2591, 49.4012, 16.809, 65.7016, 9.69359, 25.5063, 43.9266, 1.18908, 32.3331, 98.5672, 12.1865, 20.0763, 3.12408, 5.46274, 41.3231, 25.0598, 96.6987, 72.2831, 52.1451, 46.4364, 27.7495, 45.812, 75.9405, 41.617, 59.5082, 45.6461, 95.2493, 6.25856, 58.6297, 74.697, 84.2688, 28.984, 71.7642, 41.835, 28.154, 18.9906, 4.40006, 9.4568, 28.1405, 29.3636, 10.7408, 6.98748, 66.0188, 90.6344, 41.9562, 14.5307, 11.5635, 89.5946, 23.0237, 45.9363, 75.6238, 93.5014, 77.8963, 56.4939, 77.0929, 94.5823, 88.1086, 65.4029, 25.7382, 59.1488, 59.8223, 64.396, 66.7175, 46.0344, 92.164, 24.2735, 16.6828, 24.2439, 52.6865, 3.56021, 50.0308, 26.3071, 81.4128, 39.989, 70.8773, 65.527, 21.5898, 41.3304, 41.873, 3.93746, 52.0233, 26.5959, 23.6059, 64.2446, 88.683, 17.5396, 71.658, 5.03409, 2.55273, 91.957, 67.323, 98.6804, 40.4973, 38.9496, 34.861, 36.6984, 12.0177, 76.7579, 95.5737, 70.404, 38.2157, 26.902, 74.1656, 97.7712, 30.3019, 31.2271, 66.2011, 93.2353, 12.9999, 70.2584, 89.6909, 95.7818, 16.5458, 78.1867, 16.0277, 78.0037, 26.4832, 40.4183, 15.3044, 77.8104, 19.6337, 32.7615, 94.0666, 18.9886, 22.9197, 94.3013, 30.3161, 67.2075, 75.7983, 10.2394, 49.4252, 25.8124, 87.2795, 81.1131, 97.1218, 66.8273, 94.2261, 30.8429, 55.5226, 52.0467, 26.2642, 90.1831, 56.3434, 34.6705, 27.8279, 50.1253, 25.934, 42.9253, 65.1732, 65.9714, 15.9634, 73.6213, 63.2285, 6.96224, 59.383, 43.4474, 20.7372, 56.3122, 33.6857, 27.289, 59.092, 52.1098, 58.131, 10.4592, 81.6249, 83.0521, 52.8482, 24.4848, 4.97842, 53.0653, 69.1938, 19.629, 27.6403, 67.796, 80.4294, 60.8379, 5.01791, 82.6133, 95.2674, 40.1232, 13.3362, 23.2824, 21.3787, 14.4259, 14.454, 34.1246, 87.6847, 94.1204, 42.5271, 3.4354, 20.0222, 77.4832, 90.8075, 70.3495, 70.7645, 67.0948, 29.6444, 23.8627, 53.175, 34.4695, 46.2201, 5.7728, 3.02326, 90.8005, 87.4691, 54.9362, 50.9303, 27.6714, 77.9232, 57.6504, 17.3648, 96.5156, 81.7828, 55.6145, 87.012, 90.7541, 84.6597, 17.2222, 35.4683, 13.4285, 43.3852, 81.2681, 55.7406, 99.7847, 90.4437, 39.583, 10.8738, 7.36905, 99.8854, 48.8976, 48.9693, 83.8957, 73.2433, 25.6182, 77.0518, 63.1467, 88.8492, 95.8964, 28.5822, 38.221, 52.174, 4.77203, 93.6656, 11.6605, 63.7222, 59.1314, 19.4204, 90.4705, 72.525, 49.8119, 80.9291, 71.2698, 65.6535, 17.1528, 37.0476, 61.6957, 89.5297, 94.4161, 31.0261, 31.8833, 50.4717, 65.1412, 77.3572, 68.8235, 23.359, 78.8921, 21.4574, 1.1667, 88.6968, 34.7806, 51.5997, 12.9253, 25.4414, 64.9202, 45.4465, 79.7303, 41.7061, 3.63856, 58.8326, 3.86986, 40.1361, 6.7423, 65.0942, 80.4269, 15.3181, 88.8738, 74.9713, 87.0321, 71.2343, 48.5555, 73.0087, 33.0247, 16.2146, 32.2157, 62.6832, 42.5497, 86.6023, 45.424, 42.3724, 66.1002, 7.38608, 22.0806, 18.0688, 18.1134, 45.7587, 54.6867, 53.1091, 57.3116, 43.0246, 13.9631, 99.9515, 73.1185, 69.6596, 40.7006, 21.8413, 52.5498, 4.93533, 26.4593, 45.1082, 31.7518, 59.6728, 8.20397, 90.7406, 52.2254, 85.81, 22.5373, 75.4221, 11.3923, 21.2877, 72.5242, 81.3971, 72.7272, 15.1081, 7.24306, 99.2201, 84.3698, 38.8545, 6.48558, 51.107, 37.8301, 79.3367, 28.6445, 87.3042, 66.8714, 8.74354, 51.0139, 61.312, 10.6094, 89.3664, 25.175, 13.7968, 79.07, 52.8295, 75.1803, 98.5454, 41.8793, 88.8851, 20.7751, 12.5438, 93.7275, 7.75336, 30.7177, 88.3598, 41.7025, 4.83537, 70.8685, 79.2305, 60.3073, 30.9591, 28.3242, 8.33881, 73.7618, 2.2792, 16.9939, 22.5933, 63.2235, 68.3035, 36.5947, 20.3672, 19.718, 12.4798, 96.1939, 70.0533, 97.9305, 34.1889, 0.896365, 67.959, 94.8617, 65.6928, 89.843, 15.3168, 44.6526, 68.4413, 36.8463, 2.23661, 1.50914, 0.188576, 74.5659, 69.1601, 16.3727, 46.512, 35.6111, 42.8007, 54.2191, 1.51288, 73.0345, 62.7236, 9.55846, 57.8909, 56.1013, 94.7042, 9.32641, 72.1323, 38.5759, 93.581, 82.3206, 5.73557, 18.7484, 71.5705, 53.5229, 8.29941, 17.4495, 71.62, 37.3943, 90.8382, 7.24212, 36.4869, 2.35933, 37.4873, 99.3543, 65.7658, 3.39147, 80.3566, 75.5212, 63.8994, 74.7871, 16.0648, 15.8157, 46.327, 58.8434, 63.9098, 17.7821, 93.2131, 35.5327, };
        double[] insix = {64.0222, 46.2895, 63.34, 89.066, 63.4586, 6.59548, 77.8256, 72.7208, 56.1533, 58.3726, 9.88477, 16.6032, 9.15248, 49.518, 47.04, 10.2645, 31.9497, 57.7543, 43.5922, 41.82, 40.6564, 49.381, 64.523, 69.0608, 0.108398, 44.8016, 76.473, 72.6547, 61.5658, 53.4604, 53.2735, 13.687, 65.0492, 19.2026, 2.76773, 98.9001, 75.5567, 16.822, 15.5814, 57.4494, 38.2792, 34.1031, 21.5026, 44.2757, 85.1352, 66.3168, 3.02872, 88.2336, 1.42473, 85.1616, 79.3257, 54.6989, 55.4436, 16.0068, 5.24228, 53.1079, 66.8505, 32.8399, 17.2608, 68.542, 95.6259, 98.8123, 94.856, 24.7786, 60.8085, 86.1839, 78.4745, 58.1328, 47.5039, 20.8264, 83.0666, 53.0747, 99.1416, 92.6313, 73.3418, 70.3067, 25.433, 93.6073, 58.8448, 76.5438, 47.517, 58.5274, 76.332, 59.81, 51.0678, 73.0445, 58.2736, 22.4902, 52.1211, 17.5823, 43.6473, 75.4164, 85.6195, 94.4361, 53.8455, 0.697784, 16.3857, 22.9233, 7.07285, 18.7113, 27.7605, 92.9945, 93.5078, 12.7034, 34.3872, 12.5186, 12.428, 89.1598, 30.8344, 41.7751, 66.1593, 85.6052, 98.9208, 85.4261, 67.1992, 7.17516, 77.659, 51.4584, 6.3941, 32.3939, 4.9388, 13.7492, 70.9641, 49.4464, 13.7305, 85.891, 3.86547, 92.2876, 55.0002, 54.9294, 12.6001, 80.35, 39.546, 90.9076, 59.6445, 9.50294, 16.7178, 98.767, 37.3981, 62.2525, 11.0163, 78.6217, 3.21555, 3.11497, 10.6833, 68.7142, 74.0793, 24.3944, 63.1045, 1.71769, 90.4101, 22.3803, 6.38096, 8.02979, 64.0517, 2.14237, 31.2927, 76.1078, 62.6672, 33.2269, 46.2591, 92.1689, 49.4012, 16.809, 34.2695, 9.69359, 25.5063, 65.7016, 43.9266, 63.2271, 98.5672, 32.3331, 20.0763, 12.1865, 1.18908, 5.46274, 3.12408, 37.2375, 46.4364, 52.1451, 72.2831, 45.812, 27.7495, 41.617, 75.9405, 96.6987, 45.6461, 59.5082, 95.2493, 6.25856, 25.0598, 84.2688, 28.984, 74.697, 71.7642, 58.6297, 41.835, 28.154, 41.3231, 28.1405, 29.3636, 9.4568, 66.0188, 6.98748, 10.7408, 90.6344, 4.40006, 14.5307, 41.9562, 11.5635, 89.5946, 18.9906, 93.5014, 75.6238, 45.9363, 56.4939, 77.0929, 77.8963, 94.5823, 23.0237, 25.7382, 59.1488, 65.4029, 66.7175, 64.396, 59.8223, 46.0344, 88.1086, 24.2735, 16.6828, 92.164, 24.2439, 4.3306, 41.3304, 41.873, 21.5898, 3.93746, 65.527, 52.0233, 26.5959, 70.8773, 64.2446, 23.6059, 88.683, 17.5396, 39.989, 2.55273, 5.03409, 67.323, 91.957, 71.658, 40.4973, 98.6804, 81.4128, 36.6984, 34.861, 12.0177, 76.7579, 38.9496, 38.2157, 26.902, 70.404, 74.1656, 95.5737, 97.7712, 30.3019, 26.3071, 12.9999, 93.2353, 70.2584, 89.6909, 66.2011, 95.7818, 16.5458, 31.2271, 26.4832, 78.0037, 16.0277, 15.3044, 40.4183, 77.8104, 19.6337, 78.1867, 94.0666, 32.7615, 18.9886, 22.9197, 50.0308, 10.2394, 75.7983, 67.2075, 49.4252, 30.3161, 87.2795, 81.1131, 25.8124, 66.8273, 97.1218, 94.2261, 30.8429, 94.3013, 90.1831, 26.2642, 34.6705, 56.3434, 52.0467, 25.934, 50.1253, 65.1732, 42.9253, 27.8279, 65.9714, 15.9634, 55.5226, 63.2285, 6.96224, 73.6213, 43.4474, 59.383, 20.7372, 56.3122, 3.56021, 10.4592, 58.131, 52.1098, 81.6249, 59.092, 83.0521, 52.8482, 27.289, 19.629, 69.1938, 53.0653, 27.6403, 4.97842, 67.796, 80.4294, 24.4848, 82.6133, 5.01791, 60.8379, 95.2674, 33.6857, 14.4259, 21.3787, 23.2824, 87.6847, 34.1246, 14.454, 94.1204, 13.3362, 77.4832, 20.0222, 3.4354, 90.8075, 42.5271, 67.0948, 70.7645, 23.8627, 29.6444, 70.3495, 34.4695, 53.175, 40.1232, 3.02326, 5.7728, 87.4691, 90.8005, 46.2201, 27.6714, 50.9303, 77.9232, 57.6504, 54.9362, 17.3648, 96.5156, 52.6865, 35.4683, 13.4285, 17.2222, 43.3852, 84.6597, 90.4437, 99.7847, 55.7406, 39.583, 81.2681, 10.8738, 7.36905, 90.7541, 48.8976, 48.9693, 99.8854, 73.2433, 83.8957, 77.0518, 25.6182, 87.012, 38.221, 28.5822, 52.174, 4.77203, 95.8964, 93.6656, 11.6605, 88.8492, 90.4705, 19.4204, 59.1314, 49.8119, 80.9291, 72.525, 71.2698, 63.7222, 37.0476, 17.1528, 65.6535, 61.6957, 63.1467, 31.8833, 31.0261, 94.4161, 50.4717, 89.5297, 68.8235, 77.3572, 78.8921, 23.359, 65.1412, 21.4574, 1.1667, 55.6145, 25.4414, 64.9202, 12.9253, 79.7303, 41.7061, 45.4465, 3.63856, 51.5997, 3.86986, 58.8326, 40.1361, 6.7423, 34.7806, 88.8738, 15.3181, 80.4269, 74.9713, 65.0942, 71.2343, 87.0321, 88.6968, 16.2146, 33.0247, 32.2157, 62.6832, 73.0087, 86.6023, 42.5497, 48.5555, 42.3724, 45.424, 66.1002, 7.38608, 81.7828, 57.3116, 53.1091, 43.0246, 13.9631, 54.6867, 99.9515, 73.1185, 45.7587, 4.93533, 52.5498, 21.8413, 26.4593, 40.7006, 45.1082, 31.7518, 69.6596, 90.7406, 8.20397, 59.6728, 52.2254, 18.1134, 11.3923, 75.4221, 22.5373, 21.2877, 85.81, 15.1081, 72.7272, 81.3971, 7.24306, 72.5242, 84.3698, 99.2201, 18.0688, 37.8301, 51.107, 28.6445, 79.3367, 6.48558, 66.8714, 8.74354, 87.3042, 61.312, 51.0139, 10.6094, 89.3664, 38.8545, 79.07, 13.7968, 52.8295, 75.1803, 25.175, 41.8793, 98.5454, 22.0806, 30.7177, 7.75336, 93.7275, 41.7025, 4.83537, 88.3598, 70.8685, 12.5438, 30.9591, 60.3073, 28.3242, 8.33881, 79.2305, 16.9939, 2.2792, 22.5933, 63.2235, 73.7618, 68.3035, 36.5947, 20.7751, 96.1939, 12.4798, 19.718, 97.9305, 70.0533, 34.1889, 0.896365, 20.3672, 94.8617, 67.959, 65.6928, 89.843, 88.8851, 0.188576, 1.50914, 2.23661, 74.5659, 36.8463, 69.1601, 16.3727, 68.4413, 35.6111, 42.8007, 46.512, 54.2191, 44.6526, 73.0345, 62.7236, 1.51288, 56.1013, 57.8909, 9.55846, 94.7042, 15.3168, 93.581, 82.3206, 38.5759, 18.7484, 71.5705, 5.73557, 53.5229, 72.1323, 71.62, 37.3943, 17.4495, 7.24212, 90.8382, 36.4869, 2.35933, 8.29941, 99.3543, 37.4873, 65.7658, 3.39147, 9.32641, 63.8994, 74.7871, 75.5212, 16.0648, 80.3566, 46.327, 58.8434, 15.8157, 17.7821, 63.9098, 93.2131, 35.5327 };
        int parasix = 609;
        System.out.println("Tree Name: sampleSix");
        BinaryTree sampleSix = new BinaryTree();
        sampleSix.root = sampleSix.buildTree(insix, presix, 0, presix.length-1); //make a new binary tree with the in and pre order traversals
        sampleSix.printInorder(sampleSix.root);

        //Test the methods
        System.out.println("Depth: " + sampleSix.depth(sampleSix.root));
        System.out.println("Max: " + sampleSix.max(sampleSix.root));
        System.out.println("Sum: " + sampleSix.tree_sum(sampleSix.root));
        System.out.println("Average: " + sampleSix.tree_average(sampleSix.root));
        System.out.println("Is Balanced? " + sampleSix.tree_is_balanced(sampleSix.root));
        System.out.println("Is it a BST?: "+ sampleSix.isBST(sampleSix.root, 0, presix.length-1));







        //comment
    }

} //fin
