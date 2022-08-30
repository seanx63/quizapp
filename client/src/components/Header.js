import React from 'react'

export default function Header() {
  return (
    <nav class="navbar-expand-lg navbar-dark bg-dark">
    <div class="collapse navbar-collapse">

      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
            <a class="nav-link active" href="#">QuizzApp</a>
        </li>
      </ul>
      <ul class="navbar-nav my-2 my-lg-0">
        <li class="nav-item">
            <a class="nav-link" href="#">Log in</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Sign out</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Profile</a>
        </li>
      </ul>
    </div>
      
    </nav>
  )
}

