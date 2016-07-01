<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="layout" content="pphub">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="css/custom-bootstrap-show.css">
    <asset:stylesheet src="custom-bootstrap-show.css"/>
    <title>PPHub</title>
</head>
<body>
    <div class="container">
        <section class="col-md-10 content" id="home">
           <div class="col-lg-6 col-md-6 content-item">
               <asset:image src="show.png" width="60%"  class="tm-image" />
           </div>
           <div class="col-lg-6 col-md-6 content-item content-item-1 background">
             <h2 class="main-title text-center"><b>${policy.title}</b></h2>
             <h5 class="main-title2 text-center">${policy.country}, ${policy.dateOfEnactment}</h5>
               <p>${policy.legislativeReformsActs}</p>
               <div class="col-lg-12 col-md-6">
                 <div class="col-lg-6 col-md-6 sq">
                  <ul id="lista">
                  <li><b>PP Tasks </b><span style="color:blue;"> Sys Co.</span></li>
                  <li><b>PP Tasks </b><span style="color:blue;"> José Mouriño</span></li>
                  <li><b>PP Source Type </b><span style="color:blue;"> Sergio Rodríguez</span></li>
                  <li><b>Analysis Type </b><span style="color:blue;"> $1,000,000.00</span></li>
                 </ul>
                 </div>
                 <div class="col-lg-6 col-md-6 sq">
                  <ul id="lista">
                  <li><b>Realeased by </b><span style="color:blue;"> Sys Co.</span></li>
                  <li><b>Author(s) </b><span style="color:blue;"> José Mouriño</span></li>
                  <li><b>Evaluated by </b><span style="color:blue;"> Sergio Rodríguez</span></li>
                  <li><b>Cost </b><span style="color:blue;"> $ 1,000,000.00</span></li>
                  <li><b>Sponsored by </b><span style="color:blue;"> PEPSICO</span></li>
                 </ul>
                 </div>
               </div>

           </div>
       </section>

        <section class="col-md-10 content" id="externals">
        <div class="col-lg-6 col-md-6 background last about-text-container">
          <div class="col-lg-12 col-md-6">
           <div class="col-lg-6 col-md-6 sq">
            <p class="blue-downplus" id="texto2"><span class="glyphicon glyphicon glyphicon-arrow-down blue-down" style="font-size:24px"></span>&nbsp;Download PDF</p>
            <p class="blue-downplus" id="texto2"><span class="glyphicon glyphicon glyphicon-arrow-down blue-down" style="font-size:24px"></span>&nbsp;Download TXT</p>
            <h4>Share</h4>
           </div>
           <div class="col-lg-6 col-md-6 sq">
            <h4>Tags</h4>
           </div>
         </div>
        </div>
        <div class="col-lg-6 col-md-6 background last about-text-container">
           <center>
           <p class="orange-plus" id="texto"><span class="glyphicon glyphicon-plus-sign orange-plus" style="font-size:24px"></span>&nbsp;Add to my wishlist</p>
           <button type="button" class="btn btn-big orange-btn">Simulate this PP for your needs</button>
           </center>
        </div>
        </section>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.singlePageNav.min.js"></script>
</body>
</html>
