class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings, (a,b) -> (a[0] - b[0]));
        int ans = 0;
        int meetEnd = 0;
        int meetStart = 0;
        for(int i = 0; i < meetings.length; i++)
        {
            meetEnd = meetings[i][1];
            if(meetStart == 0) meetStart = meetings[i][0];
            while(i + 1 < meetings.length && meetEnd >= meetings[i + 1][0])
            {
                meetEnd = Math.max(meetEnd, meetings[i+1][1]);
                i+=1;
            }

            if(i + 1 < meetings.length)
              ans+= meetings[i+1][0] - meetEnd - 1;
        }
        ans+= days - meetEnd + meetStart - 1;
        return ans;        
    }
}