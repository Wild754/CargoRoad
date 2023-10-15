package Car;
import java.io.*;
import java.net.*;
import java.util.Timer;
import java.util.TimerTask;

public interface Gps { // Interface segregation principle
        class CarTrackingApp {
            // Simulate GPS coordinates
            private static double latitude = 0.0;
            private static double longitude = 0.0;

            public static void main(String[] args) {
                // Here you can initialize the GPS tracker and its connection to the server

                // Create a timer to simulate coordinate update
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        updateGPSData();
                        sendDataToServer(latitude, longitude);
                    }
                }, 0, 10000);
            }

            // Simulation of GPS coordinates update
            private static void updateGPSData() {
                latitude = 40.7128 + (Math.random() - 0.5);
                longitude = -74.0060 + (Math.random() - 0.5);
            }

            // Отправка данных на сервер
            private static void sendDataToServer(double latitude, double longitude) {
                try {
                    // Здесь нужно настроить соединение с сервером и отправить данные
                    URL url = new URL("");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setDoOutput(true);

                    String data = "latitude=" + latitude + "&longitude=" + longitude;

                    OutputStream out = connection.getOutputStream();
                    out.write(data.getBytes());
                    out.close();

                    int responseCode = connection.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        System.out.println(" ");
                    } else {
                        System.out.println(" " + responseCode);
                    }

                    connection.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

