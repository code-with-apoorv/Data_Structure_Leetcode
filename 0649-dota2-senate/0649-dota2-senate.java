class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        int R_count = 0;
        int D_count = 0;
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                R_count++;
            } else {
                D_count++;
            }
        }

        boolean[] banned = new boolean[n];

        int idx = 0;

        while (R_count > 0 && D_count > 0) {

            if (banned[idx]) {
                idx = (idx + 1) % n;
                continue;
            }

            if (senate.charAt(idx) == 'R') {

                int next = (idx + 1) % n;

                while (true) {
                    if (!banned[next] && senate.charAt(next) == 'D') {
                        banned[next] = true;
                        D_count--;
                        break;
                    }

                    next = (next + 1) % n;
                }

            } else {

                int next = (idx + 1) % n;

                while (true) {
                    if (!banned[next] && senate.charAt(next) == 'R') {
                        banned[next] = true;
                        R_count--;
                        break;
                    }

                    next = (next + 1) % n;
                }
            }

            idx = (idx + 1) % n;
        }

        if (R_count > 0) {
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}