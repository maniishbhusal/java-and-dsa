/*Friends Pairing Problem
 Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
 */

public class FriendsPairing {

    public static int totalFriendsPair(int n) {
        if (n == 1 || n == 2)
            return n;
        return totalFriendsPair(n - 1) + (n - 1) * totalFriendsPair(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(totalFriendsPair(n));
    }
}

/*
     explanation:
     Base Case: If there is only one friend (n = 1), there is only one way, i.e., the friend remains single.

    Recursive Case: For n friends, we can either:

    Keep the first friend single and solve the problem for the remaining n-1 friends.
    Pair the first friend with one of the remaining (n-1) friends and solve the problem for the remaining (n-2) friends.

    (n-1): This part represents the number of ways the first friend can pair up with one of the remaining (n-1) friends. The first friend has (n-1) options to choose a partner from the remaining friends.

    f(n-2): This part represents the total number of ways the remaining (n-2) friends can be either single or paired up among themselves. Since the first friend has already been paired up with one of the remaining friends, we need to solve the problem for the remaining (n-2) friends.

    So, combining these two parts, "(n-1) * f(n-2)" gives the total number of ways the first friend can pair up with one of the remaining friends, while considering all possible arrangements for the remaining friends.
 */