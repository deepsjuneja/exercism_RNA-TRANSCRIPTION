class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";

        for(int i=0;i<dnaStrand.length();i++) {
            char ch = dnaStrand.charAt(i);

            switch(ch) {
                case 'G':
                    rnaStrand += 'C';
                    break;
                
                case 'C':
                    rnaStrand += 'G';
                    break;

                case 'T':
                    rnaStrand += 'A';
                    break;

                case 'A':
                    rnaStrand += 'U';
                    break;
            }
        }

        return rnaStrand;
    }

}
