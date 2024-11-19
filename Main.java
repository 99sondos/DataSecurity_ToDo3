package datasecurity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Example key (16 bytes for AES-192)
        byte[] key = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6};

        // Example message
        byte[] message = {0, 0, 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 2, 3, 8, 9};

        // Create Sender instance
        Sender sender = new Sender();

        // Set the key for the sender
        sender.setKey(key);

        // Encrypt the message
        byte[] encryptedMessage = sender.send(message);

        // Print plaintext (original message)
        System.out.println("Encrypting:");
        System.out.println(Arrays.toString(message));

        // Print ciphertext (encrypted message)
        System.out.println("Ciphertext:");
        System.out.println(Arrays.toString(encryptedMessage));

        // Create Receiver instance
        Receiver receiver = new Receiver();

        // Set the key for the receiver
        receiver.setKey(key);

        // Decrypt the message
        byte[] decryptedMessage = receiver.receive(encryptedMessage);

        // Print decrypted plaintext
        System.out.println("Decrypted:");
        System.out.println(Arrays.toString(decryptedMessage));
    }
}

// public class Main {
    
//         public static void main(String[] args) throws Exception {
//             // Example key (16 bytes for AES-128)
//             byte[] key = "1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4".getBytes(); 
    
//             // Example message
//             byte[] message = "0,0,1,2,3,5,6,7,6,5,4,2,3,8,9".getBytes();
    
//             // Create Sender instance
//             Sender sender = new Sender();
    
//             // Set the key
//             sender.setKey(key);
    
//             // Encrypt the message
//             byte[] encryptedMessage = sender.send(message);
    
//             // Print the encrypted message (in hexadecimal format)
//             System.out.println(javax.xml.bind.DatatypeConverter.printHexBinary(encryptedMessage));
//         }
//     }
    


