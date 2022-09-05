import React from 'react'
import { Link } from 'react-router-dom'


export default function Header() {
  return (

    <nav class="navbar-expand-lg navbar-dark bg-dark sticky-top">
    <div class="navbar">

      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
            <Link to="/"class="nav-link active" href="#">QuizzApp</Link>
        </li>
      </ul>
      <ul class="navbar-nav nav_list">
        <li class="nav-item">
            <Link to="/login" class="nav-link" href="#">Log in</Link>
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

