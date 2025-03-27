class Whatsaap {

    
    void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    
     void sendMessage(String message, String image) {
        System.out.println("Sending message: " + message + " with image: " + image);
    }

   
   void sendMessage(String message, String image, String video) {
        System.out.println("Sending message: " + message + " with image: " + image + " and video: " + video);
    }

    public static void main(String[] args) {
        Whatsaap app = new Whatsaap();

       
        app.sendMessage("Hello!");
        app.sendMessage("Hello!", "image.jpg");
        app.sendMessage("Hello!", "image.jpg", "video.mp4");
    }
}