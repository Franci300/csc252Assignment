// DECLARE AND INITIALIZE AN ARRAY OF PHONE ACCESSORIES
String[] phoneAccessories = {"Charger", "Earphones", "Screen Protector", "Phone Case", "Power Bank"};


// DECLARE AND INITIALIZE TWO-DIMENSIONAL ARRAY OF NUMBERS
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};


// TRANSVERSE THE PHONE ACCESSORIES ARRAY USING A FOR LOOP
for (int i = 0; i < phoneAccessories.length; i++) {
    System.out.println(phoneAccessories[i]);
}


// TRANSVERSE THE NUMBERS ARRAY USING A NESTED FOR LOOPS
for (int i = 0; i < numbers.length; i++) {
    for (int j = 0; j < numbers[i].length; j++) {
        System.out.println(numbers[i][j]);
    }
}


// Concatenate the strings of the phoneAccessories array
StringBuilder concatenatedAccessories = new StringBuilder();
for (String accessory : phoneAccessories) {
    concatenatedAccessories.append(accessory).append(" ");
}
System.out.println(concatenatedAccessories.toString().trim());



// Concatenate the strings of the numbers array
StringBuilder concatenatedNumbers = new StringBuilder();
for (int[] row : numbers) {
    for (int num : row) {
        concatenatedNumbers.append(num).append(" ");
    }
}
System.out.println(concatenatedNumbers.toString().trim());
