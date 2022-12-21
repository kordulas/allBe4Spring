import java.util.List;
import java.util.stream.Collectors;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        int totalLength = lengthCounter(songs, Song.Genre.ROCK);
        System.out.println("Długość wszystkich piosenek typu ROCK: " + totalLength);
        long metallica = getSingerSongs(songs, "Metallica");
        System.out.println("Ilość piosenek Metallici w liście to: " + metallica);
        List<Song> songsWithoutPop = excludesGenreAndDuplicate(songs, Song.Genre.POP);
        System.out.println("Lista piosenek bez gautnku POP: " + songsWithoutPop.toString());
    }

    static int lengthCounter(List<Song> list, Song.Genre genre){
        return list.stream()
                .filter(song -> song.getGenre() == genre)
                .mapToInt(Song::getLength)
                .sum();
    }

    static long getSingerSongs(List<Song> list,String author){
        return list.stream()
                .filter(song -> song.getArtist().equals(author))
                .count();
    }

    static List<Song> excludesGenreAndDuplicate(List<Song> list, Song.Genre genreToRemove){
        return list.stream()
                .filter(song -> song.getGenre() != genreToRemove)
                .distinct()
                .collect(Collectors.toList());
    }
}