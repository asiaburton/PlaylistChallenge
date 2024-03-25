package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
            int counter1 = 0;
            int counter2 = 0;
        for( int forwards = startIndex; forwards < playList.length; forwards++) {
            if(playList[forwards] != selection) {
                counter1++;
            } else {
                break;
            }
        }
        for(int backwards = startIndex; backwards >= 0; backwards--) {
            if(playList[backwards] != selection) {
                counter2++;
            } else {
                break;
            }

        }
        return Math.min(counter1,counter2);
    }
}
