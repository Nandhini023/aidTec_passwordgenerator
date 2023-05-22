# aidTec_passwordgenerator
Intern task
Step 1: import necessary packages random for generating random numbers and  scanner for taking user input.
Step 2: get the input (length of the password,characters in the password) from user through scanner class.
Step 3: generatepassword method is created and length ,character set is passed as arguments.generated password is stored in the password variable.
Step 4: In generatepassword method  initializes a StringBuilder object named password to store the generated password.
Step 5: character sets for uppercase letters, lowercase letters, numbers, and special characters are defined as strings.
Step 6: chosen characters are determined based on the input character set. If the character set contains a particular option, the corresponding character set is appended to the chosenCharacters string.
Step 7: instance of the Random class is created to generate random numbers.
step 8: Using a loop, the method generates random characters by randomly selecting an index from the chosenCharacters string and retrieving the character at that index. The selected character is then appended to the password string.
step 9: Once the loop is complete, the password is converted to a string using the toString method of the StringBuilder class and returned.
step 10: the generated password is displayed on the console  
step 11:  user is prompted to enter the length of the password  and input(length) will be given.
step 12:  Similarly, the user is prompted to enter the character set and input(character set) will be given.
step 13: password will generated based on the input(character set) 
