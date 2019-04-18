package com.kodilla.testing.User;

public class SimpleUser {

        private String userName;
        private String userReal;

        public SimpleUser(String userName, String userReal )  {
            this.userName = userName;
            this.userReal = userReal;
        }

        public String getUserName() {
            return userName;
        }

        public String getUserReal() {
            return userReal;
        }
}
