<!doctype html>
<html lang="en" class="no-js">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title><g:layoutTitle default="Grails"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <asset:javascript src="/third-party/jquery/dist/jquery.min.js"/>
    <asset:javascript src="/third-party/bootstrap/dist/js/bootstrap.js"/>
    <asset:stylesheet src="custom-bootstrap.css"/>
    <asset:stylesheet src="/third-party/fontawesome/css/font-awesome.css"/>
    <div class="custom-nav">
      <div align="right">
        Public Policy Market
      </div>
    </div>
    <div class="navbar navbar-default ">
      <div class="container">
        <div class="navbar-header">
          <a href="#" class=""><asset:image src="logo.png" width="10%"/><font color="white"> The Public Policy Hub</font></a>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">


          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
            <g:link controller="policy" action="list" class="dropdown-toggle">Policities</g:link>
            </li>
            <li>
            </li>
            <li class="dropdown">
            <g:link controller="policy" action="upload" class="dropdown-toggle">Upload</g:link>
            </li>

          </ul>

        </div>
      </div>
    </div>
    <g:layoutHead/>
  </head>
  <body>
    <div class="col-lg-2 col-md-2 col-sm-3">
      <div class="list-group table-of-contents">
        <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
          <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingOne">
              <h4 class="panel-title">
                <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                  Our Recomendations
                </a>
              </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
              <div class="panel-body">
                <g:link controller="search" action="index" params="[q:'Clean Cities']"class="list-group-item" >Clean Cities</g:link>
                <g:link controller="search" action="index" params="[q:'Alternative education']"class="list-group-item" >Alternative education</g:link>
                <g:link controller="search" action="index" params="[q:'Mobility']"class="list-group-item" >Mobility</g:link>
                <g:link controller="search" action="index" params="[q:'Innovation']"class="list-group-item" >Innovation</g:link>
                <g:link controller="search" action="index" params="[q:'City management']"class="list-group-item" >City management</g:link>
              </div>
            </div>
          </div>
          <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingTwo">
              <h4 class="panel-title">
                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                          Most Creative Policies
                </a>
              </h4>
            </div>
            <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
              <div class="panel-body">
                <g:link controller="search" action="index" class="list-group-item" params="[q:'Squats for Tickets']" >Squats for Tickets</g:link>
                <g:link controller="search" action="index" class="list-group-item" params="[q:'PTEforPets']" >PTEforPets</g:link>
                <g:link controller="search" action="index" class="list-group-item" params="[q:'Secret Sidewalk Poems']" >Secret Sidewalk Poems</g:link>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
        <g:layoutBody/>
    </body>
</html>
