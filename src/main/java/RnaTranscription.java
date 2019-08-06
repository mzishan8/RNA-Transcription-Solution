class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuffer rnaStrand = new StringBuffer(dnaStrand);
        for (int i=0; i < rnaStrand.length(); i++){
            switch (rnaStrand.charAt(i)){
                case 'G':
                    rnaStrand.setCharAt(i,'C');
                    break;
                case 'C':
                    rnaStrand.setCharAt(i,'G');
                    break;
                case 'T':
                    rnaStrand.setCharAt(i,'A');
                    break;
                case 'A':
                    rnaStrand.setCharAt(i,'U');
                    break;
                default:
                    rnaStrand.setCharAt(i,' ');
            }
        }
        return rnaStrand.toString();
    }

}
