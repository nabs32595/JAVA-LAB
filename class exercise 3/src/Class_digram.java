class Class_digram {
    private String department = "R&D";
    private int employeeId;

    Class_digram(){        
    }
    
    public Class_digram(int employeeId) {
    this.employeeId = employeeId;
    }
        
    public void setDepartment(String department) {
    this.department = department;
    }

    public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    
    
}
