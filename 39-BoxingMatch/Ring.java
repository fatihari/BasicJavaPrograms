package boxingMatch;

import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            int count = 1;
            while (f1.getHealth() > 0 && f2.getHealth() > 0) {
                System.out.println("\n======== ROUND-" + count + "===========");

                if (count == 1) // If Round 1,
                    firstRound();

                if (count > 1) {
                    f2.setHealth(f1.hit(f2));
                    if (isWin()) {
                        break;
                    }
                    f1.setHealth(f2.hit(f1));
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
                count++;

            }
        } else
            System.out.println("The weights of the boxers do not match. ");
    }

    private void firstRound() {
        if (firstHitChange()) // Firstly, f2 hit.
        {
            System.out.println("\n" + f2.getName() + " performs the first hit in the match! \n");
            f1.setHealth(f2.hit(f1));
            f2.setHealth(f1.hit(f2));
        } else // Firstly, f1 hit.
        {
            System.out.println("\n" + f1.getName() + " performs the first hit in the match! \n");
            f2.setHealth(f1.hit(f2));
            f1.setHealth(f2.hit(f1));
        }
    }

    private boolean firstHitChange() {
        Random rnd = new Random();
        int number = rnd.nextInt(2);
        if (number == 0) // If number is 0 or false, firstly, f1 hit.
            return false;
        else // If number is 1 or false, firstly, f2 hit.
            return true;
    }

    public boolean checkWeight() {
        return (f1.getWeight() >= minWeight && f1.getWeight() <= maxWeight)
                && (f2.getWeight() >= minWeight && f2.getWeight() <= maxWeight);
    }

    public boolean isWin() {
        if (f1.getHealth() == 0) {
            System.out.println(f1.getName() + " Remaining Health \t:" + f1.getHealth());
            System.out.println(f2.getName() + " Remaining Health \t:" + f2.getHealth());
            System.out.println("\nThe winner is : " + f2.getName());
            return true;
        } else if (f2.getHealth() == 0) {
            System.out.println(f1.getName() + " Remaining Health \t:" + f1.getHealth());
            System.out.println(f2.getName() + " Remaining Health \t:" + f2.getHealth());
            System.out.println("\nThe winner is : " + f1.getName());
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("---------------------------");
        System.out.println(f1.getName() + " Remaining Health \t:" + f1.getHealth());
        System.out.println(f2.getName() + " Remaining Health \t:" + f2.getHealth());
    }
}
