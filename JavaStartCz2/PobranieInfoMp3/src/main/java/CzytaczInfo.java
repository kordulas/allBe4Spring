import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;

import java.io.File;
import java.io.IOException;

public class CzytaczInfo {
    public static void main(String[] args) throws IOException, TagException {

        File sourceFile = new File("scott_holmes_music_stylish_groove.mp3");
        MP3File mp3File = new MP3File(sourceFile);
        if(mp3File.hasID3v2Tag()){
            AbstractID3v2 tag = mp3File.getID3v2Tag();
            String albumTitle = tag.getAlbumTitle();
            String artist = tag.getLeadArtist();
            String songTitle = tag.getSongTitle();
            System.out.println("Tytuł albumu: " + albumTitle);
            System.out.println("Wykonawca: " + artist);
            System.out.println("Utwór:" +songTitle);
        }
    }
}
