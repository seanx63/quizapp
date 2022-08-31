import React, { useState } from 'react'
import Header from './Header';
import SignIn from './SignIn';
import SignUp from './SignUp';


export default function Login() {
    const [createAccount, setcreateAccount] = useState(false);
    function changeCreateAccount() {
        setcreateAccount(!createAccount);
    }
  return (
    <>
    <Header/>
        <div class="container h-100 login_form">
            <div class="row h-100 align-items-center">
              <div class="col-12 text-center">
              {createAccount ? <h1>Create your accout</h1> : <h1>Log in to your account</h1>}
                {createAccount ? <SignUp/> : <SignIn/>}
                {createAccount ? 
                    <div>
                        <p>Don't have an account?</p><button class="btn btn-success" onClick={()=>changeCreateAccount()}>Create one!</button>
                    </div> : 
                    <div>
                        <p>Already have an account?</p><button class="btn btn-success" onClick={()=>changeCreateAccount()}>Sign in!</button>
                    </div>
                }
              </div>
            </div>
        </div>
    </>

  )
}
