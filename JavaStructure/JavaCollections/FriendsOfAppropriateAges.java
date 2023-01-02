package JavaCollections;

import java.util.HashMap;

import javax.sound.midi.Soundbank;

// 825. Friends Of Appropriate Ages

// There are n persons on a social media website. You are given an integer array ages where ages[i] is the age of the ith person.

// A Person x will not send a friend request to a person y (x != y) if any of the following conditions is true:

// 1. age[y] <= 0.5 * age[x] + 7
// 2. age[y] > age[x]
// 3. age[y] > 100 && age[x] < 100
// Otherwise, x will send a friend request to y.

// Note that if x sends a request to y, y will not necessarily send a request to x. Also, a person will not send a friend request to themself.

// Return the total number of friend requests made.

// Example 1:
// Input: ages = [16,16]
// Output: 2
// Explanation: 2 people friend request each other.

// Example 2:
// Input: ages = [16,17,18]
// Output: 2
// Explanation: Friend requests are made 17 -> 16, 18 -> 17.

// Example 3:
// Input: ages = [20,30,100,110,120]
// Output: 3
// Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.

// Constraints:

// n == ages.length
// 1 <= n <= 2 * 104
// 1 <= ages[i] <= 120

public class FriendsOfAppropriateAges {

    public static int numFriendRequests(int[] ages) {

        HashMap<Integer, Integer> ageFrequency = new HashMap<>();

        for (int i = 0; i < ages.length; i++) {
            ageFrequency.put(ages[i], ageFrequency.getOrDefault(ages[i], 0) + 1);
        }

        int count = 0;
        for(int ageX : ageFrequency.keySet()){
            for(int ageY : ageFrequency.keySet()){
                if(ageY <= 0.5*ageX + 7 || ageY > ageX){
                    continue;
                }

                int xCount = ageFrequency.get(ageX);
                int yCount = ageFrequency.get(ageY);
                if(ageX == ageY){
                    count += (xCount-1)*yCount;
                }
                else{
                    count += xCount * yCount;
                }

            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] ages = { 7, 44, 108, 41, 74, 20, 25, 36, 59, 71, 98, 17, 66, 100, 39, 111, 82, 21, 41, 114, 29, 79, 95,
                76, 97, 64, 66, 98, 56, 103, 61, 12, 47, 78, 1, 79, 78, 105, 22, 67, 95, 79, 27, 10, 51, 30, 7, 43, 23,
                45, 20, 33, 95, 52, 25, 29, 117, 47, 84, 95, 42, 89, 49, 116, 44, 60, 29, 104, 116, 11, 87, 110, 120,
                23, 89, 34, 112, 84, 102, 47, 106, 102, 45, 111, 84, 70, 108, 41, 36, 77, 11, 109, 3, 111, 23, 36, 9,
                86, 71, 28, 92, 90, 115, 53, 12, 71, 114, 102, 11, 53, 44, 19, 66, 79, 13, 20, 59, 4, 112, 116, 15, 38,
                29, 87, 94, 35, 97, 9, 85, 97, 77, 18, 118, 101, 80, 29, 109, 10, 25, 85, 54, 114, 106, 93, 113, 47, 81,
                19, 61, 57, 57, 20, 19, 44, 99, 94, 73, 5, 24, 100, 97, 99, 41, 44, 114, 67, 61, 31, 2, 15, 6, 53, 108,
                119, 3, 60, 65, 72, 26, 91, 1, 22, 34, 30, 35, 86, 120, 60, 28, 88, 83, 18, 114, 64, 54, 74, 91, 30, 14,
                3, 1, 70, 106, 20, 117, 100, 111, 73, 71, 41, 70, 14, 46, 27, 51, 42, 44, 112, 111, 45, 81, 92, 66, 21,
                13, 78, 11, 67, 64, 97, 83, 13, 67, 47, 5, 74, 87, 110, 103, 96, 92, 21, 49, 22, 16, 86, 73, 56, 73, 56,
                113, 38, 3, 116, 76, 85, 107, 105, 15, 94, 46, 61, 116, 20, 104, 13, 22, 40, 118, 71, 116, 68, 12, 97,
                12, 109, 46, 4, 102, 76, 59, 71, 61, 107, 101, 61, 13, 27, 109, 22, 55, 116, 49, 6, 86, 70, 4, 10, 4,
                11, 95, 34, 31, 67, 84, 103, 73, 111, 69, 27, 67, 32, 78, 49, 94, 53, 120, 11, 109, 32, 85, 93, 5, 25,
                19, 42, 71, 49, 101, 18, 83, 98, 68, 113, 58, 18, 106, 71, 29, 80, 66, 5, 54, 73, 120, 41, 18, 74, 98,
                };

        int result = numFriendRequests(ages);

        System.out.println(result);




    }

}
