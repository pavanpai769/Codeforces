package binarysearch;


import java.util.Scanner;

public class LetsWatchFootball {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int dataNeededToWatchVideoInOneSecond = obj.nextInt();
        int downloadSpeedPerSecond = obj.nextInt();
        int totalLengthOfVideo = obj.nextInt();

        int totalDataNeededToWatchVideo= totalLengthOfVideo * dataNeededToWatchVideoInOneSecond;

        int minWaitingSecond =1;
        int maxWaitingSecond = (totalDataNeededToWatchVideo/downloadSpeedPerSecond)+1;

        int dataCanBeDownloadedWhileStreaming = totalLengthOfVideo*downloadSpeedPerSecond;

        while(minWaitingSecond<=maxWaitingSecond) {

            int midWaitingSecond = (minWaitingSecond + maxWaitingSecond) / 2;

            if (canYouWatchVideoInMidSecond(midWaitingSecond,downloadSpeedPerSecond,totalDataNeededToWatchVideo,dataCanBeDownloadedWhileStreaming)) {
                maxWaitingSecond = midWaitingSecond - 1;
            } else {
                minWaitingSecond = midWaitingSecond + 1;
            }

        }
        System.out.println(minWaitingSecond);
    }

    private static boolean canYouWatchVideoInMidSecond(int midWaitingSecond, int downloadSpeedPerSecond, int totalDataNeededToWatchVideo, int dataCanBeDownloadedWhileStreaming) {
        int dataDownloadedInMidSecond = midWaitingSecond*downloadSpeedPerSecond;
        int dataNeededToDownload = totalDataNeededToWatchVideo-dataDownloadedInMidSecond;
        return dataNeededToDownload <= dataCanBeDownloadedWhileStreaming;
    }

}

