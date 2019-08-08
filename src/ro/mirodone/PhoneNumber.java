package ro.mirodone;

class PhoneNumber {

    String createPhoneNumber(int[] numbers) {

        String number = "";

   /*     for ( int i =0 ; i< numbers.length ; i++){
            number += numbers[i];
        }*/
        for (int s : numbers) {
            number += numbers[s - 1];
        }

        return number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

}
