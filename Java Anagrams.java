static boolean isAnagram(String a, String b) {
int count = 0 ;
int count2 = 0 ;


a = a.toLowerCase();
b = b.toLowerCase();
char[] chars1 = a.toCharArray();
char[] chars2 = b.toCharArray();
java.util.Arrays.sort(chars1);
java.util.Arrays.sort(chars2);




for (int i = 0 ; i < a.length(); i++){
for (int j = i+1 ; j < a.length(); j++){
if ( a.charAt(i) == a.charAt(j) ){
count++;
}
}}




for (int i = 0 ; i < b.length(); i++){
for (int j = i+1 ; j < b.length(); j++){
if ( b.charAt(i) == b.charAt(j) ) {
count2++;
}
}
}




if (a.length() != b.length()){
return false;
}


else if (java.util.Arrays.equals(chars1,chars2)) {
return true;
}


else if ((count == count2) && (count != 0 && count2 != 0)){
return true ;
}


else if (count == 0 && count2 == 0){
return false ;
}


else {
return false ;
}




// Complete the function
}
