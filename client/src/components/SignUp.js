import React from 'react'

export default function SignUp() {
  return (
    <div class="form-group">
        <label for="email" class="login_input">Email</label>
        <input required type="email" class="form-control" name="email" id="email_input" aria-describedby="emailHelpId" placeholder="Enter Email"/>
        <label for="username" class="login_input">Username</label>
        <input required type="text" class="form-control" name="username" id="username_input" aria-describedby="helpId" placeholder="Enter Username"/>
        <label for="password" class="login_input">Password</label>
        <input required type="password" class="form-control" name="password" id="password_input" placeholder="********"/>
        <button type="submit" class="btn btn-primary login_input">Submit</button>
    </div>
  )
}
