<%-- 
    Document   : index
    Created on : 9 oct. 2023, 14:39:26
    Author     : tempuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="header-menu.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Central de sonrisas</title>
       
        <link rel="stylesheet" href="css/style-home.css" />
        <link rel="styleicon" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>
    <body>
        <!-- -->
        <div class="additional-text">
            <section class="banner"></section>

            <section class="container top-categories">
                <h1 class="head-1"> Especialidades</h1>

                <div class="container-categories">

                    <div class="card-category category-ortodoncia">
                        <p>Ortodoncia </p>


                    </div>
                    <div class="card-category category-endo">
                        <p>Endodoncia</p>

                    </div>
                    <div class="card-category category-perio">
                        <p>Periodoncia</p>

                    </div>

                </div>

            </section>

            <section class="container blogs">
                <br/>
                <h1 class="head-1">Nosotros</h1>
                <br/>
                <div class="container-blogs">
                    <div class="card-blog">

                        <div class="container-img">
                            <img src="https://concepto.de/wp-content/uploads/2016/03/vision.jpg" alt="img-blog1"/>
                        </div>

                        <div class="content-blog">
                            <h3 class="text-center">Vision</h3>

                            <p class="text-justify">
                                Ser una clínica dental de vanguardia conformada por un equipo de odontólogos de primer
                                nivel, comprometidos con su actualización continua, beneficiando de esta manera a todas las
                                personas que nos confían su salud dental.

                            </p>
                        </div>

                    </div>
                    <div class="card-blog">

                        <div class="container-img">
                            <img src="https://previews.123rf.com/images/stylephotographs/stylephotographs1611/stylephotographs161100349/66070349-flecha-de-una-br%C3%BAjula-apuntando-a-la-misi%C3%B3n-de-la-palabra-representaci%C3%B3n-3d.jpg" alt="img-blog2"/>
                        </div>

                        <div class="content-blog">
                            <h3 class="text-center">Mision</h3>

                            <p class="text-justify">
                                Brindar atención dental de calidad y un servicio amigable y personalizado, a todas aquellas
                                personas que nos confían su mejor expresión su sonrisa.
                                Central de Sonrisas tiene por objetivo brindar calidez humana y satisfacción a nuestros
                                pacientes proporcionándoles una atención en horarios cómodos a través de citas concertadas
                                telefónicamente.
                            </p>

                        </div>
                    </div>
                    <div class="card-blog">

                        <div class="container-img">
                            <img src="https://www.elnuevodia.com/resizer/gvQ9NdpZrpmCr5Rm4-yYr4aN-EU=/829x0/filters:quality(75):format(jpeg):focal(388x163:398x153)/cloudfront-us-east-1.images.arcpublishing.com/gfrmedia/P7M7PLFE3FGRVMEFMYEF7HPWMU.jpg" alt="img-blog3"/>
                        </div>

                        <div class="content-blog">
                            <h3 class="text-center">Historia</h3>

                            <p class="text-justify">
                                La clínica dental 'Central de sonrisas', lugar donde se brinda atención bucal está
                                ubicada en la Calle Sevilla 117-Av. Cayma-Arequipa, se dedica al tratamiento
                                odontológico de los pacientes, ofrece múltiples servicios como endodoncia, ortodoncia,
                                limpiezas dentales, tratamiento de caries, odontopediatría, entre otros.
                            </p>

                        </div>
                    </div>
                </div>

            </section>
        </main>

        <footer class="footer">
            <div class="container container-footer">

                <div class="menu-footer">
                    <div class="contact-info">
                        <p class="title-footer">Información de Contacto</p>
                        <ul>
                            <li>
                                Dirección: Calle Sevilla 117 - Av. Cayma - Arequipa

                            </li>
                            <li>Teléfono: 123-456-7890</li>

                            <li>EmaiL: centralsonris@gmail.com</li>
                        </ul>
                        <div class="social-icons">
                            <span class="facebook">
                                <i class="fa-brands fa-facebook-f"></i>
                            </span>
                            <span class="twitter">
                                <i class="fa-brands fa-twitter"></i>
                            </span>

                            <span class="instagram">
                                <i class="fa-brands fa-instagram"></i>
                            </span>
                        </div>
                    </div>


                    <div class="newsletter">
                        <p class="title-footer">Boletín informativo</p>

                        <div class="content">
                            <p>
                                comunicate con soporte tecnico
                            </p>
                            <input type="email" placeholder="Ingresa tu problema aquí...">
                            <button type="submit">Enviar</button>
                        </div>
                    </div>
                </div>

            </div>
        </footer>

    </div>

</body>

</html>
