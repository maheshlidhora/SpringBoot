package com.jspders.TheOrionWriters.Entities;

public class UserWithRole 
{
    private Users users;
    private Roles roles;

    // Getters 
    public Users getUsers() {
        return this.users;
    }
    public Roles getRoles() {
        return this.roles;
    }
    //  Setters 
    public void setUsers(Users users) {
        this.users = users;
    }
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
	public UserWithRole(Users users, Roles roles) {
		super();
		this.users = users;
		this.roles = roles;
	}
	public UserWithRole() {
		super();
	}   
}