package org.example;

import java.util.List;

public class Coach implements Comparable<Coach> {
    private String id;
    private String name;
    private String sport;
    private int level;
    private List<Integer> athleteRatings;

    public Coach(String id, String name, String sport, int level, List<Integer> athleteRatings) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.athleteRatings = athleteRatings;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getAverageRating() {
        if (athleteRatings == null || athleteRatings.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < athleteRatings.size(); i++) {
            int rating = athleteRatings.get(i);
            if (rating > 5) {
                sum += 5;
            } else {
                sum += rating;
            }
        }

        return sum / athleteRatings.size();
    }

    @Override
    public int compareTo(Coach other) {
        int scoreCompare = Double.compare(this.getAverageRating(), other.getAverageRating());
        if (scoreCompare != 0) {
            return scoreCompare;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "айди " + id + " имя " + name + " спорт " + sport + " уровень " + level + " рейтинг " + String.format("%.2f", getAverageRating());
    }
}
