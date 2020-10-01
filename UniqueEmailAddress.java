class UniqueEmailAddress{
    public int numUniqueEmails(String[] emails) {
        Set<String> hashSet = new HashSet<String>();
        for(String rawEmail : emails){
            String[] arr = rawEmail.split("@");
            String userName = arr[0];
            userName = userName.split("\\+")[0];
            userName = userName.replace(".","");
            hashSet.add(userName + "@" + arr[1]);
        
            
        }    
        return hashSet.size();
    
    }
}
