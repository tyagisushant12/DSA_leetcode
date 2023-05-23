class Solution {
public:
    bool isVowel(char ch){
        ch=tolower(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
        
    }
    string reverseVowels(string arr) {

           int s=0;
    int e=arr.length()-1;
while(s<e){
    if(isVowel(arr[s])&& isVowel(arr[e])){

        swap(arr[s],arr[e]);
        s++;
        e--;
      
    }
   else if(isVowel(arr[e])==0){
        e--;
    }
    else {
        s++;
    }


}
        return arr;
    }
};