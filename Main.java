class Main {  
    public static String[][][] CodonChart = 
    {
        {
            {"Phe", "Phe", "Leu", "Leu"},
            {"Ser", "Ser", "Ser", "Ser"},
            {"Tyr", "Tyr", "Stop", "Stop"},
            {"Cys", "Cys", "Stop", "Trp"}
        },
        {
            {"Leu", "Leu", "Leu", "Leu"},
            {"Pro", "Pro", "Pro", "Pro"},
            {"His", "His", "Gln", "Gln",},
            {"Arg", "Arg", "Arg", "Arg",}
        },
        {
            {"Ile", "Ile", "Ile", "Met"},
            {"Thr", "Thr", "Thr", "Thr"},
            {"Asn", "Asn", "Lys", "Lys"},
            {"Ser", "Ser", "Arg", "Arg"}
        },
        {
            {"Val", "Val", "Val", "Val"},
            {"Ala", "Ala", "Ala", "Ala"},
            {"Asp", "Asp", "Glu", "Glu"},
            {"Gly", "Gly", "Gly", "Gly"}
        }
    };
    
    public static void main(String args[]) { 
        String rna = System.console().readLine(); 
        char[] rnaSequence = rna.toCharArray();
        
        for(int i = 0; i < rnaSequence.length ; i += 4) {
            int[] aminoAcidSequence = new int[3];
            
            for(int j = 0; j < 3; j++) {
                char nitrogenousBase = rnaSequence[i+j];
                int value = 0;
                switch(nitrogenousBase) {
                    case 'U': value = 0; break;
                    case 'C': value = 1; break;
                    case 'A': value = 2; break;
                    case 'G': value = 3; break;
                }
                aminoAcidSequence[j] = value;
            }
            int x = aminoAcidSequence[0];
            int y = aminoAcidSequence[1];
            int z = aminoAcidSequence[2];
            System.out.print(CodonChart[x][y][z]+" ");
        }
    } 
}
