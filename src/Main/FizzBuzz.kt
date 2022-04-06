package Main

class FizzBuzz {
    fun play(i: Int): String {
        if(i%5==0 && i%3==0){
            return "FizzBuzz";
        }else if(i%5==0) {
            return "Buzz";
        }else if(i%3==0){
            return "Fizz";
        }
        return ""+i;
    }

}
