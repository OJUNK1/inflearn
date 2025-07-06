package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally { // catch에서 잡을 수 없는 예외가 발생해서, 예외를 밖으로 던지는 경우에도 finally를 먼저 호출하고 나서 예외를 밖으로 던짐.
            client.disconnect();
        }
    }
}
