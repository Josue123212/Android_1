package com.example.bienvenido_al_curso

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenido_al_curso.ui.theme.Bienvenido_Al_CursoTheme

/**
 * Tarjeta de presentación personal siguiendo las prácticas del laboratorio
 * Replica exactamente el diseño mostrado en la imagen de referencia
 */
@Composable
fun BusinessCard() {
    // Surface principal con fondo verde claro
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD2E8D4) // Verde claro de fondo como en la imagen
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Sección del perfil (logo, nombre, título)
            ProfileSection()
            
            Spacer(modifier = Modifier.height(80.dp)) // Espaciado amplio como en la imagen
            
            // Sección de información de contacto
            ContactSection()
        }
    }
}

/**
 * Sección superior con logo de Android, nombre y título profesional
 */
@Composable
fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo de Android en contenedor azul oscuro
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(
                    color = Color(0xFF073042), // Azul oscuro exacto de la imagen
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            // Usando la imagen PNG personalizada como icono
            Image(
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = "Logo",
                modifier = Modifier.size(80.dp)
            )
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // Nombre principal
        Text(
            text = "Jennifer Doe",
            fontSize = 32.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // Título profesional en verde
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF006D3B), // Verde oscuro para el título
            textAlign = TextAlign.Center
        )
    }
}

/**
 * Sección inferior con información de contacto
 * Incluye teléfono, redes sociales y email
 */
@Composable
fun ContactSection() {
    Column {
        // Teléfono
        ContactItem(
            icon = Icons.Default.Phone,
            text = "+11 (123) 444 555 666",
            iconColor = Color(0xFF006D3B)
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // Redes sociales
        ContactItem(
            icon = Icons.Default.Share,
            text = "@AndroidDev",
            iconColor = Color(0xFF006D3B)
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // Email
        ContactItem(
            icon = Icons.Default.Email,
            text = "jen.doe@android.com",
            iconColor = Color(0xFF006D3B)
        )
    }
}

/**
 * Componente reutilizable para cada elemento de contacto
 * Sigue el patrón Row con ícono y texto
 */
@Composable
fun ContactItem(
    icon: ImageVector,
    text: String,
    iconColor: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = iconColor,
            modifier = Modifier.size(24.dp)
        )
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

/**
 * Preview para visualizar la tarjeta en Android Studio
 * Siguiendo las prácticas del laboratorio
 */
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Bienvenido_Al_CursoTheme {
        BusinessCard()
    }
}