package ro.mirodone;

 class CleverSolution1 {

     String createPhoneNumber(int[] numbers) {
        String phoneNumber = ("(xxx) xxx-xxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;

        /// even clever solution

       // return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
        //        numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }

}
