<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="pphub">
    <title>Upload</title>
  </head>

  <body>
    <div class="col-md-10">
      <g:each in="${policyities}" var="policy">
        <g:render template="card" collection="${policy}" />
      </g:each>
    </div>
  </body>
</html>
