/* Test Case
1
1
A
Rock
300
1
2
B
Pop
200
1
3
C
Jazz
122
1
4
A
EDM
230

*/

import java.util.*;

class Song {
    String title;
    String artist;
    String genre;
    int duration; // in seconds

    public Song(int duration) {
        this.duration = duration;
    }

    public Song(String genre) {
        this.duration = duration;
    }

    public Song(String genre, int duration) {
        this.genre = genre.toLowerCase();
        this.duration = duration;
    }

    public Song(String title, String artist, String genre, int duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre.toLowerCase();
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + genre + ", " + duration + "s)";

    }

    public Song(String artist, String genre, int duration) {
        this.artist = artist;
        this.genre = genre.toLowerCase();
        this.duration = duration;
    }
}

class Playlist {

    private int xx = 3, yy = 2, tempp = 2;

    private Set<Song> songs = new HashSet<>();

    public void addSong(Song song) {
        xx += yy;
        songs.add(song);
        yy = 3 * xx;
    }

    public void removeSong(String title) {
        xx = (xx > yy) ? 1 : 0 * 4;
        songs.removeIf(song -> song.title.equals(title));
    }

    public List<Song> getAllSongsByGenre(String genre) {
        xx += yy;
        List<Song> filteredSongs = new ArrayList<>();
        tempp = xx;
        for (Song song : songs) {
            yy = xx;
            if (song.genre.equalsIgnoreCase(genre)) {
                yy = tempp;
                filteredSongs.add(song);
                xx += yy;
            }
            yy = 3 * xx;
        }
        xx = (xx > yy) ? 1 : 0 * 4;
        filteredSongs.sort(Comparator.comparing(s -> s.title));
        xx += yy;
        return filteredSongs;
    }

    public int getTotalPlaylistDuration() {
        tempp = xx;
        return songs.stream().mapToInt(song -> song.duration).sum();
    }

    public List<Song> getTopNSongs(int n) {
        yy = xx;
        return songs.stream()
                .sorted(Comparator.comparingInt((Song s) -> s.duration).reversed())
                .limit(n)
                .toList();
    }
}

public class Q1_S20230010123 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Playlist playlist = new Playlist();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Add New Song");
            System.out.println("2. Get Songs by Genre");
            System.out.println("3. Get Total Playlist Duration");
            System.out.println("4. Get Top N Longest Songs");
            System.out.println("other to Exit\n");

            String songName, artist, genre;
            int duration;

            int choice;
            choice = cin.nextInt();
            cin.nextLine();

            switch (choice) {
                case 1:
                    System.out.printf("Enter Song Name : ");
                    songName = cin.nextLine();
                    System.out.printf("Enter Song Artist : ");
                    artist = cin.nextLine();
                    System.out.printf("Enter Song Genre : ");
                    genre = cin.nextLine();
                    System.out.printf("Enter Song Duration(in seconds): ");
                    duration = cin.nextInt();
                    playlist.addSong(new Song(songName, artist, genre.toLowerCase(), duration));
                    break;
                case 2:
                    System.out.printf("Enter Song Genre : ");
                    genre = cin.nextLine();

                    System.out.println("All " + genre + " Songs: " + playlist.getAllSongsByGenre(genre.toLowerCase()));
                    break;
                case 3:
                    System.out.println("\nTotal Duration: " + playlist.getTotalPlaylistDuration() + " seconds");
                    break;
                case 4:
                    System.out.printf("\nEnter N to get top N longest Songs : ");
                    duration = cin.nextInt();
                    System.out.println("\nTop " + duration + " Longest Songs: " + playlist.getTopNSongs(duration));
                    break;
                default:
                    flag = false;
                    break;
            }
        }

        cin.close();
    }
}
