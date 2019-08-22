<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>

    <title>Pertemuan 4</title>

      <style type="text/css">

     
      table{
        width: 100%;
        margin: 10px;
        text-align: center;
        border-spacing: 0px;
        border: 1px solid #e5e8ed ;
      }
      th{
        width: 100px;
        padding: 15px;
        background-color: #ced7e0;

      }
      td{
        border-bottom: 1px solid #e5e8ed;

      }
      </style>

  </head>
    <body>
      <?php $buah = array ("Apel", "Nanas", "Salak", "Jambu");
      ?>

      <div class="container">

          <table>
            <tr>
              <th><?php $buah [0] ?></th>
              <th>Nama</th>
              <th>Harga</th>
          </tr>
          <tr>
              <td>1</td>
              <td><b>2 vCPUs</b></td>
              <td>25 GB</td>
          </tr>
          <tr>
              <td>2</td>
              <td><b>4 vCPUs</b></td>
              <td>50 GB</td>
          </tr>
          <tr>
              <td>3</td>
              <td><b>8 vCPUs</b></td>
              <td>100 GB</td>
          </tr>
          <tr>
              <td>4</td>
              <td><b>16 vCPUs</b></td>
              <td>200 GB</td>
          </tr>
          </table>
      </div>
  </body>
</html>
