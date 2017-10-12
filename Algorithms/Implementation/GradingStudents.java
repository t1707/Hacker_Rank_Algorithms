static int[] solve(int[] grades){
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]%5>=3 && grades[i]>37)
            {
                grades[i]+=(5-grades[i]%5);
            }
        }
        // Complete this function
        return grades;
    }
