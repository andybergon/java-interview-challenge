#Interview Challenge

####The problem
Older mobile phones generally had users enter in alphabetic characters by mapping characters to numbers on the keypad ad different positions. 
For example to type the letter B a user would press the number 2 twice, for the letter Y the user would press the number 9 three times.

See [here](https://github.com/trik-1/java-interview-challenge/blob/master/keypad.jpg)

The challenge is to fill in the `String getDialForString(String text)` in the `KeypadUtils` class to return the appropriate string for the given text. Tests are provided. You are also expected to add some relevant test cases for the problem.

Spaces should return the string 0 in its position.
Any non alphanumeric characters should have 1 in the position.
Any Numeric character should return the number itsself in position.

Sample input "Hel4lo ?" sample output -> "43545601", "H\*#)(*&" -> "4111111"

Note: The return type here is String not Long or Integer.

Once implemented also add any test cases to the KeypadUtilsTest class to cover any missing scenarios along with any improvements to the existing tests and classes which you feel are appropriate.

The `String getDialForString(String text)` should throw an appropriate exception for invalid input.

The project is gradle based but a gradle project does not need to be submitted. Feel free to copy the relevant classes to your own project.

####Submission
If possible please open a pull request against this repo to submit. Submissions via email also accepted.


Good Luck!
