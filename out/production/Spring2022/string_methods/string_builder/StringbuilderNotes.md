###StringBuilder append(String str); 
it adds the parameter to the StringBuilder and returns a reference
to the current StringBuilder
ex:
StringBuilder sb = new StringBuilder();
sb.append(1).append('c');
sb.append("-").append(true);
System.out.println(sb); // 1c-true

###StringBuilder insert(int offset, String str);
adds characters to the StringBuilder at the requested
index and returns a reference to the current StringBuilder.
StringBuilder sb = new StringBuilder("animals");
sb.insert(7, "-"); // sb = animals-
sb.insert(0, "-"); // sb = -animals-
sb.insert(4, "-"); // sb = -ani-mals
System.out.println(sb);

###StringBuilder delete(int start, int end);
It removes characters from the sequence and returns a
reference to the current StringBuilder.
StringBuilder sb = new StringBuilder("abcdef");
sb.delete(1, 3); // sb = adef

StringBuilder deleteCharAt(int index) Removes a character at given index and returns a reference
to the current StringBuilder
"DevXSchool".deleteCharAt(3); // returns “DevSchool”

###StringBuilder reverse();
it reverses the characters in the sequences and returns a reference to the
current StringBuilder.
StringBuilder sb = new StringBuilder("ABC");
sb.reverse();
System.out.println(sb);

###String toString();
Converts a StringBuilder into a String
   StringBuilder sb = new StringBuilder("ABC");
   String s = sb.toString();
   System.out.println(s); // ABC
