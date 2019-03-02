import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        String str =
                "2019-02-28 19:42:26:520,INFO,Lark-->VideoChat(VideoChatInitor.java:299),VideoConferencePushService: onPushVideoChatCombinedInfo,Pid[4190],Tid[4190:main]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:522,INFO,Lark-->LOGGER_SVG(VcCommonStatisticsInitializer.java:110),VC_SVG: Rust->Rust: onPushVideoChatCombinedInfo,Pid[4190],Tid[4190:main]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:523,INFO,Lark-->VideoChat(VideoChatInitor.java:299),VideoChatStateMachine: 退出 CallingState,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:524,INFO,Lark-->VideoChat(VideoChatInitor.java:299),MeetingDataManager: [updateCombinedInfo] combinedInfo = {videoChatInMeetingInfo = {id = 6663015323324645639, hostId = 6659162018869674253, version = , videoChatSettings = {topic = 赵奕威的视频会议, isMicrophoneMuted = false, isCameraMuted = false}, shareScreenUserId = , participants = {{id = 6659162018869674253, status = ON_THE_CALL, is_host = true, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = MOBILE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}, {id = 6627989044783481102, status = RINGING, is_host = false, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = UNKNOWN_DEVICE_TYPE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}, }}},Pid[4190],Tid[4190:main]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:525,INFO,Lark-->VideoChat(VideoChatInitor.java:299),BdVideoMeetingActionPerformer: [performAction] action = 124, videochat = id = 6663015323324645639, hostId = 6659162018869674253, type = MEET, groupId = 6663012584477688075, inviteId = , sdkType = byteRTC, zoomMeetNo = 6663015323324645639, endReason = UNKNOWN_END_REASON, videoChatSettings = {topic = 赵奕威的视频会议, isMicrophoneMuted = false, isCameraMuted = false}, vendorType = RTC, participants = {{id = 6659162018869674253, status = ON_THE_CALL, is_host = true, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = MOBILE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}{id = 6627989044783481102, status = RINGING, is_host = false, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = UNKNOWN_DEVICE_TYPE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}},Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:525,INFO,Lark-->VideoChat(VideoChatInitor.java:299),UserInfoService: getUserInfoById: userId = 6659162018869674253, isSingleClear = false,Pid[4190],Tid[4190:main]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:526,INFO,Lark-->VideoChat(VideoChatInitor.java:299),BdVideoMeetingActionPerformer: handleCallingExitAction,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:527,INFO,Lark-->VideoChat(VideoChatInitor.java:299),UserInfoService: getUserInfoById: userId = 6627989044783481102, isSingleClear = false,Pid[4190],Tid[4190:main]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:532,INFO,Lark-->LOGGER_SVG(VcCommonStatisticsInitializer.java:110),VC_SVG: StateEngine->StateEngine: exitCallingState, did = 609017822150001,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:534,DEBUG,Lark-->SdkSender(ImSdkInit.java:280),async nonWrap sendRequest command = STOP_BYTEVIEW_POLLING,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:536,INFO,Lark-->VideoChat(VideoChatInitor.java:299),VideoChatStateMachine: 进入 OnTheCallState,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:538,INFO,Lark-->VideoChat(VideoChatInitor.java:299),BdVideoMeetingActionPerformer: [performAction] action = 127, videochat = id = 6663015323324645639, hostId = 6659162018869674253, type = MEET, groupId = 6663012584477688075, inviteId = , sdkType = byteRTC, zoomMeetNo = 6663015323324645639, endReason = UNKNOWN_END_REASON, videoChatSettings = {topic = 赵奕威的视频会议, isMicrophoneMuted = false, isCameraMuted = false}, vendorType = RTC, participants = {{id = 6659162018869674253, status = ON_THE_CALL, is_host = true, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = MOBILE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}{id = 6627989044783481102, status = RINGING, is_host = false, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = UNKNOWN_DEVICE_TYPE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}},Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:539,INFO,Lark-->VideoChat(VCLog.java:22),PollingMechanism: [stopPolling] onSuccess,Pid[4190],Tid[4699:lk-io-4]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:543,INFO,Lark-->VideoChat(VideoChatInitor.java:299),BdVideoMeetingActionPerformer: [handleOnthecallEntryAction],Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:544,INFO,Lark-->LOGGER_SVG(VcCommonStatisticsInitializer.java:110),VC_SVG: StateEngine->StateEngine: entryOnTheCallState, did = 609017822150001,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:545,INFO,Lark-->VideoChat(VideoChatInitor.java:299),MultiMeetingEventListenerHolder: [joinSingleSessionEvent] listener = default, videochat = id = 6663015323324645639, hostId = 6659162018869674253, type = MEET, groupId = 6663012584477688075, inviteId = , sdkType = byteRTC, zoomMeetNo = 6663015323324645639, endReason = UNKNOWN_END_REASON, videoChatSettings = {topic = 赵奕威的视频会议, isMicrophoneMuted = false, isCameraMuted = false}, vendorType = RTC, participants = {{id = 6659162018869674253, status = ON_THE_CALL, is_host = true, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = MOBILE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}{id = 6627989044783481102, status = RINGING, is_host = false, offlineReason = UNKNOWN_OFFLINE_REASON, deviceType = UNKNOWN_DEVICE_TYPE, participantSettings = {isMicrophoneMuted = false, isCameraMuted = false}}},Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:546,INFO,Lark-->LOGGER_SVG(VcCommonStatisticsInitializer.java:110),VC_SVG: StateEngine->UI: showOnTheCallFragment,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:546,INFO,Lark-->VideoChat(VideoChatInitor.java:299),MeetingDataManager: init,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:546,INFO,Lark-->VideoChat(VCLog.java:22),VideoChatService: [createVideoChat]  onSuccess id = 6663015323324645639,Pid[4190],Tid[4737:lk-io-5]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:547,INFO,Lark-->VideoChat(VideoChatInitor.java:299),MultiMeetingPresenter: onCreateVideoChatSuccess: conferenceId = 6663015323324645639,Pid[4190],Tid[4737:lk-io-5]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:549,INFO,Lark-->VideoChat(VCLog.java:22),VideoChatPush: [onPushVideoChatCombinedInfo],Pid[4190],Tid[4280:lk-cpu-1]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:549,INFO,Lark-->VideoChat(VideoChatInitor.java:299),ByteRTCMeetingActivity: showOnTheCallFragment ,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:550,INFO,Lark-->VideoChat(VideoChatInitor.java:299),MeetingErrorMonitor: setMeetingOnTheCallFlag,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:551,INFO,Lark-->VideoChat(VCLog.java:22),VideoChatService: [getChatterById] success,Pid[4190],Tid[4190:main]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:551,INFO,Lark-->VideoChat(VideoChatInitor.java:299),BdVideoMeetingActionPerformer: MeetingFeedbackDialog meetingStartTime: 1551354146551,Pid[4190],Tid[5112:VideoChatStateMachine]\n" +
                        "\n" +
                        "2019-02-28 19:42:26:552,INFO,Lark-->VideoChat(VideoChatInitor.java:299),PushEventDispatcher: [dispatch] event = 1201, data = {\"key_chatter_avarta"
                ;
        println(JSONFormater.format(str));

    }

    private static void println(String str) {
        File file = new File("/Users/yuluo/IdeaProjects/JSONFormater/src/out.txt");

        try (FileWriter fop = new FileWriter(file)) {

            // if file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fop.write("");
            fop.flush();
            // get the content in bytes
            byte[] contentInBytes = str.getBytes();

            fop.write(str);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
